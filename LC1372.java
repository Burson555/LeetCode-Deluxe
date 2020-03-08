// Runtime: 56 ms, faster than 14.29% of Java online submissions for Longest ZigZag Path in a Binary Tree.
// Memory Usage: 61.2 MB, less than 100.00% of Java online submissions for Longest ZigZag Path in a Binary Tree.

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
    
    final int L = 1;
    final int R = 2;
    HashMap<TreeNode, Integer> hm = new HashMap<>();
    
    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        addNodes(q, root);
        int res = 0;
        while (!q.isEmpty()) {
            root = q.remove();
            res = Integer.max(res, 1+move(root.left, R));
            res = Integer.max(res, 1+move(root.right, L));
        }
        return res;
    }
    
    private int move(TreeNode root, int dir) {
        if (root == null) return -1;
        if (dir == L && (hm.get(root) == 3 || hm.get(root) == L)) {
            hm.put(root, hm.get(root)-L);
            return 1+move(root.left, R);
        }
        if (dir == R && (hm.get(root) == 3 || hm.get(root) == R)) {
            hm.put(root, hm.get(root)-R);
            return 1+move(root.right, L);
        }
        return -1;
    }
    
    private void addNodes(Queue<TreeNode> q, TreeNode root) {
        if (root == null) return;
        q.add(root);
        hm.put(root, 3);
        addNodes(q, root.left);
        addNodes(q, root.right);
    }
}