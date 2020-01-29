// Runtime: 1 ms, faster than 99.92% of Java online submissions for Reorder List.
// Memory Usage: 45.5 MB, less than 6.82% of Java online submissions for Reorder List.
// Runtime: 1 ms, faster than 99.92% of Java online submissions for Reorder List.
// Memory Usage: 45.4 MB, less than 6.82% of Java online submissions for Reorder List.
// Runtime: 1 ms, faster than 99.92% of Java online submissions for Reorder List.
// Memory Usage: 45.4 MB, less than 6.82% of Java online submissions for Reorder List.
// Runtime: 1 ms, faster than 99.92% of Java online submissions for Reorder List.
// Memory Usage: 45.7 MB, less than 6.82% of Java online submissions for Reorder List.
// Runtime: 1 ms, faster than 99.92% of Java online submissions for Reorder List.
// Memory Usage: 45.3 MB, less than 6.82% of Java online submissions for Reorder List.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null)
            return;
        ListNode tail   =   head;
        ListNode odd    =   head;
        while (odd.next != null && odd.next.next != null) {
            odd = odd.next.next;
            tail = tail.next;
        }
        ListNode even = this.reverseList(tail.next);
        tail.next = null;
        odd = head;
        ListNode temp_odd = head;
        ListNode temp_even = head;
        while (even != null) {
            temp_odd = temp_odd.next;
            odd.next = even;
            odd = temp_odd;
            temp_even = even.next;
            even.next = odd;
            even = temp_even;
        }
    }
    private ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode prev = null;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}