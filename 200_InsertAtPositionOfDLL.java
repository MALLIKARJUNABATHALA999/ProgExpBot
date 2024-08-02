class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
    
	{
	    if(head_ref==null) return;
	    Node newnode=new Node(data);
	    Node curr=head_ref;
	    for(int i=0;i<pos&& curr.next!=null;i++){
	        curr=curr.next;
	    }
	    newnode.next=curr.next;
	    if(curr.next!=null){
	        curr.next.prev=newnode;
	    }
	    curr.next=newnode;
	    newnode.prev=curr;
	}
}