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
        if(headA==null || headB==null){ //// No intersection
            return null;
        }
        ListNode A=headA, B=headB;
        // Move both pointers until they either meet or become null
        while(A!=B){
            A=(A==null)? headB : A.next; // Switch to headB if A reaches end
            B=(B==null)? headA : B.next; // Switch to headA if B reaches end
        }
        return A;
        

    }
}
