// Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
// Memory Usage: 41.3 MB, less than 7.41% of Java online submissions for Merge Two Sorted Lists.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val <= l2.val) {
            l1.next = this.mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = this.mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

// class Solution {
//     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//         if (l1 == null)
//             return l2;
//         if (l2 == null)
//             return l1;
//         ListNode head;
//         ListNode prev = null;
//         ListNode smaller;
//         ListNode bigger;
//         if (l1.val <= l2.val){
//             head = l1;
//             smaller = l1;
//             bigger = l2;
//         } else {
//             head = l2;
//             smaller = l2;
//             bigger = l1;
//         }
//         while (smaller != null){
//             if (smaller.val > bigger.val) {
//                 prev.next = bigger;
//                 ListNode temp = smaller;
//                 smaller = bigger;
//                 bigger = temp;
//             }
//             prev = smaller;
//             smaller = smaller.next;
//         }
//         if (bigger != null)
//             prev.next = bigger;
//         return head;
//     }
// }