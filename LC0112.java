// Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
// Memory Usage: 41.1 MB, less than 5.88% of Java online submissions for Path Sum.

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
    public boolean hasPathSum(final TreeNode root, final int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null)
            return root.val == sum;
        return hasPathSum(root.left, sum-root.val) 
                || hasPathSum(root.right, sum-root.val);
    }
}