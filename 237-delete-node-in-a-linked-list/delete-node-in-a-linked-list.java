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
        
        ListNode start = node.next;
        while(start.next!=null)
        {
            node.val = start.val;
            node = node.next;
            start = start.next;
        }
        node.val = start.val;
        node.next = null;
    }
}