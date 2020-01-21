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


// Runtime: 2 ms, faster than 40.90% of Java online submissions for Palindrome Linked List.
// Memory Usage: 48.1 MB, less than 6.10% of Java online submissions for Palindrome Linked List.
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         if (head == null)
//             return true;
        
//         int length = 0;
//         ListNode temp = head;
//         while (temp != null) {
//             length++;
//             temp = temp.next;
//         }
        
//         temp = head;
//         for (int i = 0; i < (length-1)/2; i++)
//             temp = temp.next;
//         temp.next = this.reverseLinkedList(temp.next);
        
//         ListNode l_ptr = head;
//         ListNode r_ptr = temp.next;
//         while (r_ptr != null) {
//             if (r_ptr.val != l_ptr.val){
//                 temp.next = this.reverseLinkedList(temp.next);
//                 return false;
//             }
//             l_ptr = l_ptr.next;
//             r_ptr = r_ptr.next;
//         }
//         temp.next = this.reverseLinkedList(temp.next);
        
//         return true;
//     }
    
//     private ListNode reverseLinkedList(ListNode head) {
//         if (head == null)
//             return null;
//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode temp = head;
//         while (curr != null) {
//             temp = temp.next;
//             curr.next = prev;
//             prev = curr;
//             curr = temp;
//         }
//         return prev;
//     }
// }