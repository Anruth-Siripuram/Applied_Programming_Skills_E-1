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
    public ListNode reverseList(ListNode head) {
        ListNode pptr=null;
        ListNode tptr=head;
        ListNode nptr=null;
        while(tptr!=null){
            nptr=tptr.next;
            tptr.next=pptr;
            pptr=tptr;
            tptr=nptr;
        }
        return pptr;
    }
}
