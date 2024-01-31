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

public class Solution {
    public static int length(Node head){
        //Your code goes here
        if (head ==null){
            return 0;
        }
        if(head.next==null){
            return 1;
        }
        int cnt=1;
        Node current=head;
        while(current.next!=null){
            cnt++;
            current=current.next;
        }
        return cnt;
    }
}