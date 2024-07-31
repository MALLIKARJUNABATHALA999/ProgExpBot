/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA=headA;
        ListNode currB=headB;
        int count1=0;
        int count2=0;
        while(currA!=null){
            count1++;
            currA=currA.next;
        }
        while(currB!=null){
            count2++;
            currB=currB.next;
        }
        int difference=Math.abs(count1-count2);
        currA=headA;
        currB=headB;
        if(count1>count2){
            for(int i=0;i<difference;i++){
                currA=currA.next;
            }
        }
        else{
             for(int i=0;i<difference;i++){
                currB=currB.next;
            }
        }
        while(currA!=null && currB!=null){
            if(currA==currB){
                return currA.data;
            }
            currA=currA.next;
            currB=currB.next;
        }
        return null;
    }
}