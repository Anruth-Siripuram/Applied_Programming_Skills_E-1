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
        ListNode fptr=head,lptr=head;
        while(lptr!=null&&lptr.next!=null){
            fptr=fptr.next;
            lptr=lptr.next.next;
            if(fptr==lptr){
                break;
            }
        }
        if(lptr==null||lptr.next==null){
            return null;
        }
        fptr=head;
        while(fptr!=lptr){
            fptr=fptr.next;
            lptr=lptr.next;
        }
        return fptr;
    }
}
