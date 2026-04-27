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
    public boolean isPalindrome(ListNode head) {
        ListNode fptr=head,lptr=head;
        int count=0;
        while(lptr!=null){
            lptr=lptr.next;
            count++;
        }
        lptr=head;
        for(int i=0;i<count/2;i++){
            lptr=lptr.next;
        }
        if(count%2!=0){
            lptr=lptr.next;
        }
        ListNode nptr=null,tptr=null;
        while(lptr!=null){
            nptr=lptr.next;
            lptr.next=tptr;
            tptr=lptr;
            lptr=nptr;
        }
        while(fptr!=null && tptr!=null){
            if(fptr.val!=tptr.val){
                return false;
            }
            fptr=fptr.next;
            tptr=tptr.next;
        }
        return true;
    }
}
