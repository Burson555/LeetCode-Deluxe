/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {

    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
    // Memory Usage: 37.6 MB, less than 94.24% of Java online submissions for Reverse Linked List.
    public ListNode reverseList1(ListNode head) {
        ListNode prev = head;
        ListNode temp = null;
        while (prev != null) {
            prev = head.next;
            head.next = temp;
            temp = head;
            head = prev;
        }
        return temp;
    }
    
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
    // Memory Usage: 37.8 MB, less than 41.37% of Java online submissions for Reverse Linked List.
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode new_head = this.reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return new_head;
    }
}