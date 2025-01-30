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
        if(head==null || head.next==null) return true;
        //Step-1 -> Find middle 
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //Step-2 -> Reverse second half
        ListNode secondhalf=reverseList(slow);
        ListNode firsthalf=head;

        //Step-3 -> Compare secondhalf and firsthalf
        ListNode temp=secondhalf;
        boolean isPalindrome=true;
        while(temp!=null){
            if(firsthalf.val!=temp.val){
                return false;
            }
            firsthalf=firsthalf.next;
            temp=temp.next;
        }
        
        return isPalindrome;
    }
    private ListNode reverseList(ListNode head){
        ListNode prev=null, current=head;
        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
/*  -- Naive Approach -- time-O(2n), space-O(n)
    public boolean isPalindrome(ListNode head) {
        Stack<Integer>st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.val!=st.peek()){
                return false;
            }
            temp=temp.next;
            st.pop();
            
        }
        return true;
    }
*/
