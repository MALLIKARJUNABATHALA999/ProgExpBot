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
 import java.util.ArrayList;
 import java.util.Arrays;
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode curr=head;
        ListNode Dummy=new ListNode(-1);
        ListNode dum=Dummy;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        Integer[] arrtoArray=arr.toArray(new Integer[0]);
        Arrays.sort(arrtoArray);
        for(int i=0;i<arrtoArray.length;i++){
            ListNode newNode=new ListNode(arrtoArray[i]);
            dum.next=newNode;
            dum=dum.next;
        }    
        dum.next=null;
        return Dummy.next;
    }
}