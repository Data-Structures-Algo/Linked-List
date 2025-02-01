class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        //three dummy nodes for seperate lists (0,1 and 2 lists)
        Node zerohead =  new Node(0);
        Node onehead = new Node(0);
        Node twohead = new Node(0);
        
        //three pointers for all three of them
        Node zero=zerohead, one=onehead, two=twohead;
        Node temp=head; //pointer for original list
        
        //add to the 0-> 0's and 1->1's and 2-> 2's
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }
            else if(temp.data==1){
                one.next=temp;
                one=one.next;
            }else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        //merge 0,1 and 2s
        zero.next=(onehead.next!=null) ? onehead.next : twohead.next;
        one.next=twohead.next;
        two.next=null;
        
        return zerohead.next;
    }
}
