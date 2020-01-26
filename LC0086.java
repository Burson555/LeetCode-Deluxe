// Runtime: 0 ms, faster than 100.00% of Java online submissions for Partition List.
// Memory Usage: 41 MB, less than 5.77% of Java online submissions for Partition List.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode more = new ListNode(0);
        ListNode temp_less = less;
        ListNode temp_more = more;
        ListNode iter = head;
        while (iter != null) {
            if (iter.val < x) {
                temp_less.next = iter;
                iter = iter.next;
                temp_less = temp_less.next;
                temp_less.next = null;
            } else {
                temp_more.next = iter;
                iter = iter.next;
                temp_more = temp_more.next;
                temp_more.next = null;
            }
        }
        temp_less.next = more.next;
        return less.next;
    }
}