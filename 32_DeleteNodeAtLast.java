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

public class Solution {
    public static Node deleteLast(Node list){
        if(list==null){
            return null;
        }
        if(list.next==null){
            return null;
        }
        // Write your code here
        Node current=list;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        return list;
    }
}