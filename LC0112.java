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



// Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
// Memory Usage: 39 MB, less than 8.23% of Java online submissions for Path Sum.
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && root.val == sum)
            return true;
        boolean res = false;
        if (root.left != null) res |= hasPathSum(root.left, sum-root.val);
        if (root.right != null) res |= hasPathSum(root.right, sum-root.val);
        return res;
    }
}