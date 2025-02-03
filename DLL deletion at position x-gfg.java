class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        if(head==null) return null;
        
        if(x==1){
            head=head.next;
            if(head!=null) head.prev=null;
            return head;
        }
        Node temp=head;
        for(int i=1;i<x;i++){
            if(temp==null) return head; //out of bound
            temp=temp.next;
        }
        //if temp is last node, update prev's node's next
        if(temp.next!=null) temp.next.prev=temp.prev;
        
        //if temp is not 1st node, update prev's node's next
        if(temp.prev!=null) temp.prev.next=temp.next;
        
        return head;
    }
}
