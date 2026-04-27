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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ptr=head;
        int count=0;
        while(ptr!=null&&count<k){
            ptr=ptr.next;
            count++;
        }
        if(count==k){
            ptr=reverseKGroup(ptr,k);
            while(count-->0){
                ListNode nptr=head.next;
                head.next=ptr;
                ptr=head;
                head=nptr;
            }
            head=ptr;
        }
        return head;
    }
}
