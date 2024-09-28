/* If the list is 4 -> 5 -> 1 -> 9 and you are given the node with value 5 to delete:

You copy the value 1 from the next node into the node 5, so the list becomes: 4 -> 1 -> 1 -> 9.
Then you adjust the next pointer of the current node (1) to skip over the next 1, so the list becomes: 4 -> 1 -> 9.  */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //Copy the value of the next node to the current node
        node.val = node.next.val;
        
        //Change the next pointer to skip the next node
        node.next = node.next.next;
    }
}
