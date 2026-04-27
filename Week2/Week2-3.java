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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode Winterfell=new ListNode();
        ListNode Sansa=Winterfell;
        ListNode Jon=list1;
        ListNode Ramsay=list2;
        while(Jon!=null && Ramsay!=null){
            if(Jon.val<=Ramsay.val){
                Sansa.next=Jon;
                Jon=Jon.next;
            }else{
                Sansa.next=Ramsay;
                Ramsay=Ramsay.next;
            }
            Sansa=Sansa.next;
        }
        if(Jon!=null){
            Sansa.next=Jon;
        }
        if(Ramsay!=null){
            Sansa.next=Ramsay;
        }
        return Winterfell.next;
    }
}
