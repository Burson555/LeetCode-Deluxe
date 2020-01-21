// Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
// Memory Usage: 43.6 MB, less than 5.09% of Java online submissions for Delete Node in a Linked List.

// We don't have to consider the case where node == null OR node.next == null.
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
        while (node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }
}