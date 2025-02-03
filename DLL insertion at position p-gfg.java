class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        
        Node node=new Node(x);
        if(head==null){
            return node;
        }
        Node temp=head;
        for(int i=0;i<p;i++){
            if(temp.next==null) break;
            temp=temp.next;
        }
        Node tempp1=temp.next;
        
        temp.next=node;
        node.next=tempp1;
        node.prev=temp;
        
        if(tempp1!=null){
            tempp1.prev=node;
        }
        
        
        return head;
    }
}
