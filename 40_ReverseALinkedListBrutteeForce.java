import java.util.Stack;
public class ReverseALinkedListBrutteForce {
    public static NOde reverseLinkedList(NOde head){
        NOde temp=head;
        Stack<Integer> stack=new Stack<>();
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;

        }
        temp=head;
        while(temp!=null){
            temp.data=stack.pop();
            temp=temp.next;

        }
        return head;
    }
    public static void printLinkedList(NOde head){
        NOde temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        NOde head=new NOde(10);
        head.next=new NOde(20);
        head.next.next=new NOde(30);
        head.next.next.next=new NOde(40);
        System.out.println("original linkedlist");
        printLinkedList(head);
        head=reverseLinkedList(head);
        System.out.println("reversed linkedlist");
        printLinkedList(head);
    }
}
class NOde{
    int data;
    NOde next;
    NOde(int data){
        this.data=data;
        this.next=null;
    }
    NOde(int data,NOde next){
        this.data=data;
        this.next=next;
    }
}
