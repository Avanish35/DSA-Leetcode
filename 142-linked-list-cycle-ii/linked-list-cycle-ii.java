/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s = head;
        ListNode l = head;

        while(l != null && l.next != null){
            s = s.next;
            l = l.next.next;

            if(s==l){
                ListNode ptr = head;
                while(ptr != s){
                    s = s.next;
                    ptr = ptr.next;
                }
                return ptr;
            }
        }
        return null;
    }
}