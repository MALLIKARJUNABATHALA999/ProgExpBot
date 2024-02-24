import java.util.* ;
import java.io.*; 
/*************************************************************

Following is the class structure of the Node class:

    class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
	  	}
    }

*************************************************************/

public class Solution {
	public static Node addOne(Node head) {
		// Write your code here.
		head=reverse(head);
		int carry=1;
		Node curr=head;
		while(curr!=null){
			int sum=carry+curr.data;
			curr.data=sum%10;
			carry=sum/10;
			if(curr.next==null && carry>0){
				curr.next=new Node(carry);
				break;
			}
			curr=curr.next;
		}
		return reverse(head);

	}
	static Node reverse(Node head){
		Node prev=null;
		Node curr=head;
		while(curr!=null){
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;

		}
		return prev;
	}
}