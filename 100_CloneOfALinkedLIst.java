import java.util.HashMap;
import java.util.Map;

class ListNode {
    int val;
    ListNode next, random;

    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CloneLinkedList {

    public ListNode clone(ListNode head) {
        if (head == null) {
            return null;
        }

        // Create a mapping between original nodes and cloned nodes
        Map<ListNode, ListNode> nodeMap = new HashMap<>();

        // First pass: create cloned nodes and map them
        ListNode current = head;
        while (current != null) {
            nodeMap.put(current, new ListNode(current.val));
            current = current.next;
        }

        // Second pass: connect next and random pointers in cloned nodes
        current = head;
        while (current != null) {
            ListNode clonedNode = nodeMap.get(current);
            clonedNode.next = nodeMap.get(current.next);
            clonedNode.random = nodeMap.get(current.random);
            current = current.next;
        }

        // Return the head of the cloned list
        return nodeMap.get(head);
    }

    public static void main(String[] args) {
        // Example usage
        CloneLinkedList solution = new CloneLinkedList();

        // Create a sample linked list with random pointers
        ListNode originalHead = new ListNode(1);
        originalHead.next = new ListNode(2);
        originalHead.next.next = new ListNode(3);
        originalHead.next.next.next = new ListNode(4);
        originalHead.random = originalHead.next.next; // 1 -> 3
        originalHead.next.random = originalHead; // 2 -> 1
        originalHead.next.next.random = originalHead.next.next.next; // 3 -> 4
        originalHead.next.next.next.random = originalHead.next; // 4 -> 2

        // Clone the linked list
        ListNode clonedHead = solution.clone(originalHead);

        // Print the original and cloned lists
        System.out.println("Original List:");
        printList(originalHead);
        System.out.println("\nCloned List:");
        printList(clonedHead);
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print("(" + current.val + " -> " + (current.random != null ? current.random.val : "null") + ") ");
            current = current.next;
        }
        System.out.println();
    }
}
