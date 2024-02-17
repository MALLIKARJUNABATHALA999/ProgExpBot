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
 }

 *****************************************************************/

public class Solution
{
    public static Node segregateEvenOdd(Node head)
    {
        Node evennode=new Node(0);
        Node oddnode=new Node(0);
        Node even=evennode;
        Node odd=oddnode;
        while(head!=null){
            if(head.data%2==0){
                even.next=head;
                even=even.next;
            }
            else{
                odd.next=head;
                odd=odd.next;
            }
            head=head.next;
        }
        even.next=oddnode.next;
        odd.next=null;
        return evennode.next;
        // Write Your Code Here.
    }
}