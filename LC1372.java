// It seems Math.max is faster than Integer.max

// Runtime: 9 ms, faster than 26.00% of Java online submissions for Longest ZigZag Path in a Binary Tree.
// Memory Usage: 53.3 MB, less than 100.00% of Java online submissions for Longest ZigZag Path in a Binary Tree.

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
    public int longestZigZag(TreeNode root) {
        return helper(root)[2];
    }
    
    /**
    @return length-3 array res: res[0] is the ZigZag path length from the left child,
                                res[1] is the ZigZag path length from the right child,
                                res[2] is the longest ZigZag path length in the whole subtree
    */
    private int[] helper(TreeNode tn) {
        if (tn == null) return new int[]{-1, -1, -1};
        int[] l_arr = helper(tn.left);
        int[] r_arr = helper(tn.right);
        int l_val = l_arr[1]+1;
        int r_val = r_arr[0]+1;
        int max_len = Math.max(l_arr[2], r_arr[2]);
        max_len = Math.max(max_len, l_val);
        max_len = Math.max(max_len, r_val);
        return new int[]{l_val, r_val, max_len};
    }
}


// // Runtime: 56 ms, faster than 14.29% of Java online submissions for Longest ZigZag Path in a Binary Tree.
// // Memory Usage: 61.2 MB, less than 100.00% of Java online submissions for Longest ZigZag Path in a Binary Tree.

// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */
// class Solution {
    
//     final int L = 1;
//     final int R = 2;
//     HashMap<TreeNode, Integer> hm = new HashMap<>();
    
//     public int longestZigZag(TreeNode root) {
//         if (root == null) return 0;
//         Queue<TreeNode> q = new LinkedList<>();
//         addNodes(q, root);
//         int res = 0;
//         while (!q.isEmpty()) {
//             root = q.remove();
//             res = Integer.max(res, 1+move(root.left, R));
//             res = Integer.max(res, 1+move(root.right, L));
//         }
//         return res;
//     }
    
//     private int move(TreeNode root, int dir) {
//         if (root == null) return -1;
//         if (dir == L && (hm.get(root) == 3 || hm.get(root) == L)) {
//             hm.put(root, hm.get(root)-L);
//             return 1+move(root.left, R);
//         }
//         if (dir == R && (hm.get(root) == 3 || hm.get(root) == R)) {
//             hm.put(root, hm.get(root)-R);
//             return 1+move(root.right, L);
//         }
//         return -1;
//     }
    
//     private void addNodes(Queue<TreeNode> q, TreeNode root) {
//         if (root == null) return;
//         q.add(root);
//         hm.put(root, 3);
//         addNodes(q, root.left);
//         addNodes(q, root.right);
//     }
// }