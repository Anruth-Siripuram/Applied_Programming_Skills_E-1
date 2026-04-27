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
        if(headA==null||headB==null){
            return null;
        }
        ListNode ptra=headA,ptrb=headB;
        while(ptra!=ptrb){
            ptra=(ptra==null)?headA:ptra.next;
            ptrb=(ptrb==null)?headB:ptrb.next;
        }
        return ptra;
    }
}
