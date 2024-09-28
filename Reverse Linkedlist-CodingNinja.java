public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> current = head;
        
        while (current != null) 
        {
            
            LinkedListNode<Integer> next = current.next;
            
            // Reverse the current node's pointer
            current.next = prev;
            
            // Move pointers one step forward
            prev = current;
            current = next;
        }
        
        // At the end, prev will be pointing to the new head
        return prev;
    }
}
