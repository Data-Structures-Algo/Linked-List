class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        if(head==null || head.next==null){
            return 0;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                return countLoopNodes(slow);
            }
        }
        return 0;
        
    }
    private int countLoopNodes(Node LoopNode){
        int count=1;
        Node temp=LoopNode.next;
        while(temp!=LoopNode){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
