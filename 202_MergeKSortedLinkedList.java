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
    public ListNode mergeKLists(ListNode[] lists) {
          if (lists == null || lists.length == 0) {
            return null;
        }
        
        ListNode head = lists[0];
        for (int i = 1; i < lists.length; i++) {
            head = merge2List(head, lists[i]);
        }
        return head;
    }

    public ListNode merge2List(ListNode a, ListNode b) {
        if (a == null) return b;
        if (b == null) return a;
        
        ListNode head, temp;
        if (a.val <= b.val) {
            head = temp = a;
            a = a.next;
        } else {
            head = temp = b;
            b = b.next;
        }
        
        while (a != null && b != null) {
            if (a.val <= b.val) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        
        if (a == null) {
            temp.next = b;
        } else {
            temp.next = a;
        }
        
        return head;
    }
}