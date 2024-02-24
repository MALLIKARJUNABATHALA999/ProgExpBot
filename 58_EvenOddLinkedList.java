/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode evenDummy=new ListNode(0);
        ListNode oddDummy=new ListNode(0);
        ListNode even=evenDummy;
        ListNode odd=oddDummy;
        int index=1;
        while(head!=null){
            if(index%2==0){
                even.next=head;
                even=even.next;
            }
            else{
                odd.next=head;
                odd=odd.next;
            }
            head=head.next;
            index++;
        }
        odd.next=evenDummy.next;
        even.next=null;
        return oddDummy.next;
    }
}