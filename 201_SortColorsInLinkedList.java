*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
          if (head == null || head.next == null) {
            return head;
        }

        // Create dummy nodes for the lists of 0s, 1s, and 2s.
        Node zeroDummy = new Node(0);
        Node oneDummy = new Node(0);
        Node twoDummy = new Node(0);

        // Pointers to the current nodes in the 0s, 1s, and 2s lists.
        Node zero = zeroDummy;
        Node one = oneDummy;
        Node two = twoDummy;

        // Traverse the list and distribute the nodes into the three lists.
        Node current = head;
        while (current != null) {
            if (current.data == 0) {
                zero.next = current;
                zero = zero.next;
            } else if (current.data == 1) {
                one.next = current;
                one = one.next;
            } else {
                two.next = current;
                two = two.next;
            }
            current = current.next;
        }

        // Combine the lists of 0s, 1s, and 2s.
        zero.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;
        one.next = twoDummy.next;
        two.next = null;

        // The new head is the next of the zeroDummy node.
        return zeroDummy.next;
    }
}
