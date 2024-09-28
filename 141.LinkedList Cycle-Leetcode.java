public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if (head == null || head.next == null) {
            return false;
        }
        
        
        ListNode slow = head;
        ListNode fast = head;
        
        
        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
            
            // If slow and fast meet, there is a cycle
            if (slow == fast) {
                return true;
            }
        }
      
        return false;
    }
}
