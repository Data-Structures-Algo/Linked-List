class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        
        while (list1 != null && list2 != null) {
            // Compare values of list1 and list2, and attach the smaller one
            if (list1.val <= list2.val) {
                current.next = list1;  // Attach list1 node
                list1 = list1.next;    // Move list1 pointer
            } else {
                current.next = list2;  // Attach list2 node
                list2 = list2.next;    // Move list2 pointer
            }
            current = current.next; // Move the current pointer forward
        }
        
        // If any of the lists still has nodes, append them directly
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        
        // The merged list is attached after the dummy node, so return dummy.next
        return dummy.next;
    }
}
