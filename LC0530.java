// Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Absolute Difference in BST.
// Memory Usage: 39.3 MB, less than 92.31% of Java online submissions for Minimum Absolute Difference in BST.

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
    
    private boolean is_first = true;
    private int prev;
    private int res = Integer.MAX_VALUE;
    
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return res;
    }
    
    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        int curr = root.val;
        if (is_first) is_first = false;
        else res = Integer.min(res, curr-prev);
        prev = curr;
        inOrder(root.right);
    }
}

// // Runtime: 4 ms, faster than 11.95% of Java online submissions for Minimum Absolute Difference in BST.
// // Memory Usage: 40.1 MB, less than 65.38% of Java online submissions for Minimum Absolute Difference in BST.

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
    
//     private PriorityQueue<Integer> pq = new PriorityQueue<>();
    
//     public int getMinimumDifference(TreeNode root) {
//         addNode(root);
//         int curr = pq.poll(), res = Integer.MAX_VALUE;
//         while (pq.peek() != null) {
//             int temp = pq.poll();
//             res = Integer.min(res, temp-curr);
//             curr = temp;
//         }
//         return res;
//     }
    
//     private void addNode(TreeNode root) {
//         pq.offer(root.val);
//         if (root.left != null) addNode(root.left);
//         if (root.right != null) addNode(root.right);
//     }
// }