// Runtime: 19 ms, faster than 60.04% of Java online submissions for Path Sum III.
// Memory Usage: 39.4 MB, less than 84.09% of Java online submissions for Path Sum III.

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
    
    int count = 0, target;
    
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return count;
        target = sum;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode n = q.remove();
            dfs(n, 0);
            if (n.left != null) q.add(n.left);
            if (n.right != null) q.add(n.right);
        }
        
        return count;
    }
    
    private void dfs(TreeNode root, int temp) {
        int sum = temp+root.val;
        if (sum == target) count += 1;
        if (root.left != null) dfs(root.left, sum);
        if (root.right != null) dfs(root.right, sum);
    }
    
}