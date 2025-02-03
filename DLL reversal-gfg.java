class Solution {
    public Node reverseDLL(Node head) {
        if (head == null || head.next == null) return head; // No need to reverse if empty or single node
        
        Node temp = null;
        Node current = head;

        // Swap prev and next for all nodes
        while (current != null) {
            temp = current.prev;  // Store prev
            current.prev = current.next; // Swap prev and next
            current.next = temp;
            current = current.prev; // Move to the next node (which was previously next)
        }
        
        // Update head to the new first node (previously the last node)
        return temp.prev;
    }
}
