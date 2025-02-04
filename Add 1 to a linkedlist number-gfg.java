class Solution {
    public Node addOne(Node head) {
        // code here.
        //reverse list
        head=reverseList(head);
        Node temp=head;
        int carry=1;
        
        while(temp!=null){
            temp.data += carry;
            if(temp.data<10){ //if value is below 10 no carry needed
                carry=0;
                break;
            }
            temp.data=0; //if value is 10, set it to 0
            carry=1;
            if(temp.next==null) break; //end of LL
            temp=temp.next;
        }
        if(carry==1){ //if carry is still 1
            temp.next=new Node(1); 
        }
        return reverseList(head);
        
    }
    private Node reverseList(Node head){
        Node current=head;
        Node prev=null;
        while(current!=null){
            Node next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
