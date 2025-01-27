class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        if(head==null){
            return 0;
        }
        int count=1;
        Node temp=head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
