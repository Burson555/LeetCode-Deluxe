// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Linked List Elements.
// Memory Usage: 47.2 MB, less than 6.35% of Java online submissions for Remove Linked List Elements.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        while (head.val == val){
            head = head.next;
            if (head == null)
                return null;
        }
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.next.val == val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }
}