// Runtime: 44 ms, faster than 10.69% of Java online submissions for Insertion Sort List.
// Memory Usage: 45.5 MB, less than 5.13% of Java online submissions for Insertion Sort List.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    // public ListNode insertionSortList(ListNode head) {
    //     if (head == null)
    //         return null;
    //     ListNode sorted_part = this.insertionSortList(head.next);
    //     ListNode dummy = new ListNode(0);
    //     dummy.next = sorted_part;
    //     ListNode temp = dummy;
    //     while (temp.next != null && temp.next.val < head.val)
    //         temp = temp.next;
    //     head.next = temp.next;
    //     temp.next = head;
    //     return dummy.next;
    // }
    
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-9999999);
        dummy.next = head;
        ListNode tail = dummy;
        while (head != null) {
            tail.next = head.next;
            ListNode temp = dummy;
            while (temp != tail && temp.next.val < head.val)
                temp = temp.next;
            head.next = temp.next;
            temp.next = head;
            tail = (temp == tail) ? tail.next : tail;
            head = tail.next;
        }
        return dummy.next;
    }
}