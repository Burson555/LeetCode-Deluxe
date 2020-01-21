// Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
// Memory Usage: 39.6 MB, less than 7.84% of Java online submissions for Middle of the Linked List.

// Just forget about the memory use.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

// class Solution {
//     public ListNode middleNode(ListNode head) {
//         if (head == null)
//             return null;
//         ListNode slow = head;
//         ListNode fast = head;
//         while (fast.next != null && fast.next.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return (fast.next == null) ? slow : slow.next;
//     }
// }