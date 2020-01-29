// Runtime: 1 ms, faster than 78.87% of Java online submissions for Binary Tree Level Order Traversal.
// Memory Usage: 38.8 MB, less than 5.33% of Java online submissions for Binary Tree Level Order Traversal.
// Runtime: 1 ms, faster than 78.87% of Java online submissions for Binary Tree Level Order Traversal.
// Memory Usage: 39.3 MB, less than 5.33% of Java online submissions for Binary Tree Level Order Traversal.
// Runtime: 2 ms, faster than 11.74% of Java online submissions for Binary Tree Level Order Traversal.
// Memory Usage: 39.1 MB, less than 5.33% of Java online submissions for Binary Tree Level Order Traversal.
// Runtime: 1 ms, faster than 78.87% of Java online submissions for Binary Tree Level Order Traversal.
// Memory Usage: 38.8 MB, less than 5.33% of Java online submissions for Binary Tree Level Order Traversal.
// Runtime: 2 ms, faster than 11.74% of Java online submissions for Binary Tree Level Order Traversal.
// Memory Usage: 39.1 MB, less than 5.33% of Java online submissions for Binary Tree Level Order Traversal.

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rl = new LinkedList<>();
        int height = this.maxHeight(root);
        for (int i = 0; i < height; i++) {
            List<Integer> tl = new LinkedList<>();
            rl.add(i, tl);
        }
        this.populateList(rl, root, height, height);
        return rl;
    }
    
    private void populateList(List<List<Integer>> rl, TreeNode root, int height, int level) {
        if (root == null) return;
        rl.get(height-level).add(root.val);
        this.populateList(rl, root.left, height, level-1);
        this.populateList(rl, root.right, height, level-1);
    }
        
    private int maxHeight(TreeNode root) {
        if (root == null) return 0;
        int lh = this.maxHeight(root.left);
        int rh = this.maxHeight(root.right);
        return (1 + ((lh >= rh) ? lh : rh));
    }
}