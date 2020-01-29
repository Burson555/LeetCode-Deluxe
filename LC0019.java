// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
// Memory Usage: 38 MB, less than 6.37% of Java online submissions for Remove Nth Node From End of List.

// Forget again about the memory use.
// dummy is really of great help.
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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = head;
        for (int i = 0; i < n-1; i++) {
            temp = temp.next;
            if (temp == null)
                return head;
        }
        ListNode prev = dummy;
        while (temp.next != null) {
            temp = temp.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return dummy.next;
    }
}