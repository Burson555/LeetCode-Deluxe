// Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
// Memory Usage: 46.9 MB, less than 5.71% of Java online submissions for Linked List Cycle.
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
    
    // public boolean hasCycle(ListNode head) {
    //     HashSet<ListNode> visited = new HashSet<>();
    //     while (head != null) {
    //         if (visited.contains(head))
    //             return true;
    //         visited.add(head);
    //         head = head.next;
    //     }
    //     return false;
    // }
}