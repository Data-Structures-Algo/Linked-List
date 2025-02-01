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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode odd = head; //odd positioned nodes start from head
        ListNode even = head.next; //even positioned nodes start from head.next
        ListNode evenhead=even; // store start of even list

        while(even!=null && even.next!=null){
            odd.next=even.next; //link odd to next odd positioned node
            odd=odd.next;

            even.next=odd.next; //link even to next even positioned node
            even=even.next;
        }
        odd.next=evenhead; //attach even list after odd list
        return head; //head remains unchanged
    }
}
