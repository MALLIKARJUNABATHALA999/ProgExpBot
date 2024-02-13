/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static int lengthOfLoop(Node head) {
        // Write your code here
        if(head==null) return 0;
        if(head.next==null) return 0;
        Node slow=head;
        
        Node fast=head;int cnt=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null || fast.next==null) return 0;
        cnt=1;
        slow=slow.next;
        while(slow!=fast){
            slow=slow.next;
            cnt++;
        }
        return cnt;
    }
}