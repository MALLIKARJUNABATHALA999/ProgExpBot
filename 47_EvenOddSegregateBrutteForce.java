import java.util.ArrayList;

public class EvenOddNodeSegregate{
    public static void main(String args[]){
        Nuode head=new Nuode(1);
        head.next=new Nuode(2);
        head.next.next=new Nuode(3);
        head.next.next.next=new Nuode(44);
        head.next.next.next.next=new Nuode(5);
        head.next.next.next.next.next=new Nuode(6);
        System.out.println("Linked list before evenOdd segregate");
        printlist(head);
        System.out.println("Linked list after evenOdd segregate");
        Nuode result=evenOddSegregate(head);
        printlist(result);
    }
    public static void printlist( Nuode head){
        Nuode curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static Nuode evenOddSegregate(Nuode head){
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        if(head==null || head.next==null){
            return head;
        }
        Nuode curr=head;
        while(curr!=null){
            if(curr.data%2==0){
                even.add(curr.data);
            }
            else{
                odd.add(curr.data);
            }
            curr=curr.next;
        }
        curr =head;
        for(int evenele:even){
            curr.data=evenele;
            curr=curr.next;
        }
        for(int oddele:odd){
            curr.data=oddele;
            curr=curr.next;
        }
        return head;
    }
}
class Nuode{
    int data;
    Nuode next;
    Nuode(int data){
        this.data=data;
        this.next=null;
    }
}