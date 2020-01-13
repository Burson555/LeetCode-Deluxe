/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List II.
// Memory Usage: 35.3 MB, less than 100.00% of Java online submissions for Reverse Linked List II.

class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // for later convenience
        if (m == n)
            return head;
        
        // find the end of front sequence and the start of middle sequence
        ListNode front_end  = null;
        ListNode middle_end = head;
        int i = 1;
        for (; i < m; i++){
            front_end = middle_end;
            middle_end = middle_end.next;
        }
        
        // reverse the middle sequence, this works even m == n
        ListNode temp = null;
        ListNode curr = middle_end;
        ListNode prev = middle_end;
        for (; i <= n; i++) {
            prev = curr.next;
            curr.next = temp;
            temp = curr;
            curr = prev;
        }
        
        // stick them together
        // now temp represents the start of the new middle sequence
        // curr and prev both represent the start of the back sequence
        // curr and prev can be null, which does not matter
        // because m != n, the non-null middle sequence does exist
        middle_end.next = curr;
        
        // the only remaining problem is to deal with the front sequence
        // which equals to null only when m == 1
        // at this time front_end == null
        if (front_end != null)
            front_end.next = temp;
        else
            head = temp;
        return head;
            
    }
}