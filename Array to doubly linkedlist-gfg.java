class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        if(arr.length==0){
            return null;
        }
        Node head=new Node(arr[0]);
        Node temp=head;
        
        for(int i=1;i<arr.length;i++){
            Node newnode= new Node(arr[i]);
            temp.next= newnode;
            newnode.prev=temp;
            temp=newnode;
        }
        return head;
    }
}
