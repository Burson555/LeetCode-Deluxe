// Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
// Memory Usage: 38.7 MB, less than 94.62% of Java online submissions for Maximum Depth of Binary Tree.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
// Memory Usage: 38.9 MB, less than 94.62% of Java online submissions for Maximum Depth of Binary Tree.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
// Memory Usage: 39.2 MB, less than 94.62% of Java online submissions for Maximum Depth of Binary Tree.

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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int lh = this.maxDepth(root.left);
        int rh = this.maxDepth(root.right);
        return (1 + ((lh >= rh) ? lh : rh));
    }
}