class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    // Function to insert a new node at the end of the circular linked list
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Function to delete the kth node from the circular linked list
    void deleteKthNode(int k) {
        if (head == null)
            return;

        Node current = head;
        Node previous = null;
        int count = 1;

        // Traverse to find the kth node and keep track of the previous node
        do {
            previous = current;
            current = current.next;
            count++;
        } while (current != head && count < k);

        // If k is greater than the number of nodes in the list
        if (count < k) {
            System.out.println("Invalid k value");
            return;
        }

        // If the kth node is the head itself
        if (current == head) {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            if (head.next == head) {
                head = null;
            } else {
                temp.next = head.next;
                head = head.next;
            }
        } else {
            previous.next = current.next;
        }

        // Free the memory of the deleted node (optional, depending on the programming language)
    }

    // Function to display the circular linked list
    void display() {
        if (head == null)
            return;

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class DeleteKthNOdeOnCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);

        System.out.println("Original Circular Linked List:");
        cll.display();

        int k = 2; // Example value of k
        cll.deleteKthNode(k);

        System.out.println("Circular Linked List after deleting the " + k + "th node:");
        cll.display();
    }
}
