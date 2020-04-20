// Runtime: 0 ms, faster than 100.00% of Java online submissions for Diameter of Binary Tree.
// Memory Usage: 39.2 MB, less than 18.18% of Java online submissions for Diameter of Binary Tree.

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
    public int diameterOfBinaryTree(TreeNode root) {
        return getInfo(root)[1];
    }
    
    /**
    * @return array of size 2
    *           the 1st entry is the maximal height from this root
    *           the 2nd entry is the longest path under, maybe not containing this entry
    */
    private int[] getInfo(TreeNode root) {
        if (root == null) return new int[]{-1, 0};
        final int from_l[] = getInfo(root.left);
        final int from_r[] = getInfo(root.right);
        final int max_height = 1+Integer.max(from_l[0], from_r[0]);
        int longest_path = Integer.max(from_l[0]+from_r[0]+2, from_l[1]);
        longest_path = Integer.max(longest_path, from_r[1]);
        return new int[]{max_height, longest_path};
    }
}