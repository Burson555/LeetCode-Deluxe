// Runtime: 1 ms, faster than 99.98% of Java online submissions for Path Sum II.
// Memory Usage: 40.2 MB, less than 18.18% of Java online submissions for Path Sum II.
// Runtime: 1 ms, faster than 99.98% of Java online submissions for Path Sum II.
// Memory Usage: 39.6 MB, less than 22.73% of Java online submissions for Path Sum II.

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
    
    List<List<Integer>> res_l;
        
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        res_l = new LinkedList<>();
        if (root == null) return res_l;
        
        dfs(root, sum, new ArrayList<>());
        return res_l;
    }
    
    private void dfs(TreeNode root, int sum, List<Integer> temp) {
        // quit condition
        if (root.left == null && root.right == null && root.val == sum) {
            temp.add(root.val);
            res_l.add(new LinkedList(temp));
            temp.remove(temp.size()-1);
            return;
        }
        
        // node selection
        temp.add(root.val);
        if (root.left != null) dfs(root.left, sum-root.val, temp);
        if (root.right != null) dfs(root.right, sum-root.val, temp);
        temp.remove(temp.size()-1);
    }
    
}