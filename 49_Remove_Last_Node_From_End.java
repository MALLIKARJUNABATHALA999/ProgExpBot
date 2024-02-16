/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/
public class Solution {
    public static Node removeKthNode(Node head, int K) {
        if (head == null || K <= 0) {
            return null; // Invalid input
        }

        int length = getLength(head);

        if (K > length) {
            return head; // K is greater than the length of the list, no removal needed
        }

        if (K == length) {
            return head.next; // Remove the head node
        }

        int positionToRemove = length - K + 1;
        Node current = head;
        Node prev = null;

        for (int i = 1; i < positionToRemove; i++) {
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            prev.next = current.next;
            if (current.next != null) {
                current.next.prev = prev;
            }
        }

        return head;
    }

    private static int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}
