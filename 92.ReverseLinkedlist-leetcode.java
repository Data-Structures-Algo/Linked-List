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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
        ListNode dummy=new ListNode(0); //a dummy node
        dummy.next=head; //just before head
        ListNode prevLeft=dummy; //prevLeft Pointer pointing at dummy(0)

        for(int i=0;i<left-1;i++){
            prevLeft=prevLeft.next; //Reach the left integer
        }

        ListNode start=prevLeft.next; //start with the left integer
        ListNode then=start.next; //then is the left+1

        for(int i=0;i<right-left;i++){
            start.next=then.next; // start.next->then.next
            then.next=prevLeft.next; //then.next->prevLeft.next 
            prevLeft.next=then;
            then=start.next;
        }
        return dummy.next;
    }
}
