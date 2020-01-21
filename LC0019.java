// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
// Memory Usage: 40.2 MB, less than 6.37% of Java online submissions for Remove Nth Node From End of List.

// Forget again about the memory use.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0)
            return head;
        ListNode temp = head;
        for (int i = 1; i < n; i++) {
            temp = temp.next;
            if (temp == null)
                return head;
        }
        ListNode target = head;
        ListNode prev = null;
        while (temp.next != null) {
            temp = temp.next;
            prev = target;
            target = target.next;
        }
        if (prev == null)
            return target.next;
        prev.next = target.next;
        return head;
    }
}