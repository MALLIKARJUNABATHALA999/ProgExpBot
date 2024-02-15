import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeInLInkedListBrutte {
    public static void main(String args[]){
        ListNnode head=new ListNnode('r');
        head.next=new ListNnode('a');
        head.next.next=new ListNnode('d');
        head.next.next.next=new ListNnode('a');
        head.next.next.next.next=new ListNnode('r');
        boolean result=Palindrome(head);
        if(result){
            System.out.println("given character will be palindrome");
        }
        else{
            System.out.println("given character not a palindrome");
        }
    }
    public  static boolean Palindrome(ListNnode head){
       Deque<Character> stack=new ArrayDeque<Character>();
       for(ListNnode curr=head;curr!=null;curr=curr.next){
           stack.push(curr.data);
       }
       for(ListNnode curr=head;curr!=null;curr=curr.next){
           if(stack.pop()!=curr.data){
               return false;
           }
       }
       return true;
    }
}
class ListNnode{
    char data;
    ListNnode next;
    ListNnode(char data){
        this.data=data;
        this.next=null;
    }
}
