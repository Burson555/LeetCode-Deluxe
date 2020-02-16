// Runtime: 2 ms, faster than 77.38% of Java online submissions for Add Two Numbers.
// Memory Usage: 41.1 MB, less than 91.22% of Java online submissions for Add Two Numbers.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dm = new ListNode(0);
        ListNode curr = dm;
        int carryout = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carryout;
            curr.next = new ListNode(sum % 10);
            carryout = sum/10;
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode temp = null;
        if (l1 != null) temp = l1;
        if (l2 != null) temp = l2;
        while (temp != null) {
            int sum = temp.val + carryout;
            curr.next = new ListNode(sum % 10);
            carryout = sum/10;
            curr = curr.next;
            temp = temp.next;
        }
        if (carryout != 0)
            curr.next = new ListNode(carryout);
        return dm.next;
    }
}