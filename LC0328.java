// Runtime: 0 ms, faster than 100.00% of Java online submissions for Odd Even Linked List.
// Memory Usage: 45.9 MB, less than 5.00% of Java online submissions for Odd Even Linked List.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;
        ListNode onode = head;
        ListNode enode = head.next;
        ListNode ehead = head.next;
        while (onode != null && enode != null) {
            onode.next = enode.next;
            if (onode.next != null) {
                onode = onode.next;
                enode.next = onode.next;
                enode = enode.next;
            } else {
                onode.next = ehead;
                onode = null;
            }
        }
        if (enode == null)
            onode.next = ehead;        
        return head;
    }
}