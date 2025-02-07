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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;

        while(head!=null){
            //if duplicate found
            if(head.next!=null && head.val==head.next.val){
                //skip
                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                }
                //remove duplicates
                prev.next=head.next;
            }
            else{
                prev=prev.next; //if no duplicates
            }
            head=head.next;
        }
        return dummy.next; //return modified list
    }
}
