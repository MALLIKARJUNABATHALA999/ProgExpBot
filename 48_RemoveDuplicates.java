public class RemoveDuplicatesFromSortedSinglyLinkedList{
    public static void main(String args[]){
        N head=new N(10);
        head.next=new N(10);
        head.next.next=new N(10);
        head.next.next.next=new N(20);
        head.next.next.next.next=new N(20);
        head.next.next.next.next.next=new N(30);
        head.next.next.next.next.next.next=new N(30);
        removeDuplicates(head);
        System.out.println("Before removing the duplicates:");
        printList(head);
        System.out.println("after removing the duplicates");
        printList(head);
    }
    public static void removeDuplicates(N head){
        N curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }

    }
    public static void printList(N head){
        N curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
}
class N{
    int data;
    N next;
    N(int data){
        this.data=data;
        this.next=null;
    }
}
