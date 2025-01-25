class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node n=new Node(x);
        if(head==null){
            return n;
        }
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        
        tail.next=n;
        return head;
    }
}
