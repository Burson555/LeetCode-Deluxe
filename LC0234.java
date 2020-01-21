// Runtime: 1 ms, faster than 98.96% of Java online submissions for Palindrome Linked List.
// Memory Usage: 50.5 MB, less than 6.10% of Java online submissions for Palindrome Linked List.

// The only way to achieve O(N) space is to reverse the first or second half of the linked list.
// However, even we reverse the linked list back in the end, we modified its structure in the middle.
// That is not a good sign.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    ListNode temp;
    
    public boolean isPalindrome(ListNode head) {
        temp = head;
        return check(head);
    }
    
    private boolean check(ListNode head) {
        if (head == null)
            return true;
        boolean ret_val = check(head.next) & (head.val == temp.val);
        temp = temp.next;
        return ret_val;
    }
    
}