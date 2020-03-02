// Runtime: 1 ms, faster than 100.00% of Java online submissions for Linked List in Binary Tree.
// Memory Usage: 42 MB, less than 100.00% of Java online submissions for Linked List in Binary Tree.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        // the initial root cannot be null
        // we can also make sure each root in recursive calls is not null
        if (head.val == root.val && this.check(head, root)) {
            return true;
        } else {
            if (root.left != null && this.isSubPath(head, root.left)) return true;
            if (root.right != null && this.isSubPath(head, root.right)) return true;
            return false;
        }
    }
    
    private boolean check(ListNode head, TreeNode root) {
        // head != null always holds
        if (head.val != root.val) return false;
        // head.val == root.val
        if (head.next == null) return true;
        // head.next != null
        if (root.left != null && this.check(head.next, root.left)) return true;
        if (root.right != null && this.check(head.next, root.right)) return true;
        return false;
    }
}