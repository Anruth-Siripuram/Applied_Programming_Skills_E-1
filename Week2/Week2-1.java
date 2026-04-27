/**
 * Definition for singly-linked list.
 public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode tptr=new ListNode();
        tptr=head;
        int count=0;
        while(tptr!=null){
            tptr=tptr.next;
            count++;
        }
        ListNode nptr=new ListNode();
        nptr=head;
        for(int i=0;i<count/2;i++){
            nptr=nptr.next;
        }
        return nptr;
    }
}
