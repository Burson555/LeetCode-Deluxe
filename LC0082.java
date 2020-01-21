// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List II.
// Memory Usage: 43.1 MB, less than 6.98% of Java online submissions for Remove Duplicates from Sorted List II.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        boolean is_dup = false;
        while (head.next != null) {
            if (head.next.val == head.val) {
                head = head.next;
                is_dup = true;
            } else {
                if (is_dup) {
                    is_dup = false;
                    head = head.next;
                    continue;
                }
                prev.next = head;
                prev = prev.next;
                head = head.next;
            }
        }
        prev.next = (is_dup) ? null : head;
        return dummy.next;
    }
}