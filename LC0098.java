// Runtime: 0 ms, faster than 100.00% of Java online submissions for Validate Binary Search Tree.
// Memory Usage: 39.9 MB, less than 70.70% of Java online submissions for Validate Binary Search Tree.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Validate Binary Search Tree.
// Memory Usage: 39.3 MB, less than 80.47% of Java online submissions for Validate Binary Search Tree.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Validate Binary Search Tree.
// Memory Usage: 39.6 MB, less than 78.61% of Java online submissions for Validate Binary Search Tree.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Validate Binary Search Tree.
// Memory Usage: 39.5 MB, less than 80.47% of Java online submissions for Validate Binary Search Tree.

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
    int prev;
    boolean is_left_most;
    
    public Solution() {
        this.prev = Integer.MIN_VALUE;
        this.is_left_most = false;
    }
    
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        boolean l = this.isValidBST(root.left);
        boolean m = true;
        if (!this.is_left_most) {
            this.is_left_most = true;
            if (root.val == Integer.MIN_VALUE)
                m = true;
        } else if (root.val <= prev) {
            m = false;
        }
        prev = root.val;
        boolean r = this.isValidBST(root.right);
        return (l && m && r);
    }
}



// // Runtime: 1 ms, faster than 35.92% of Java online submissions for Validate Binary Search Tree.
// // Memory Usage: 41.5 MB, less than 5.58% of Java online submissions for Validate Binary Search Tree.
// // Runtime: 1 ms, faster than 35.92% of Java online submissions for Validate Binary Search Tree.
// // Memory Usage: 41.6 MB, less than 5.58% of Java online submissions for Validate Binary Search Tree.
// // Runtime: 1 ms, faster than 35.92% of Java online submissions for Validate Binary Search Tree.
// // Memory Usage: 41.8 MB, less than 5.58% of Java online submissions for Validate Binary Search Tree.
// // Runtime: 1 ms, faster than 35.92% of Java online submissions for Validate Binary Search Tree.
// // Memory Usage: 41.2 MB, less than 5.58% of Java online submissions for Validate Binary Search Tree.

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
//     public boolean isValidBST(TreeNode root) {
//         Queue<Integer> q = new LinkedList<>();
//         this.addToQueue(root, q);
//         if (q.isEmpty()) return true;
//         int prev = q.remove().intValue();
//         while (!q.isEmpty()) {
//             int temp = q.remove().intValue();
//             if (temp <= prev) return false;
//             prev = temp;
//         }
//         return true;
//     }
    
//     private void addToQueue(TreeNode root, Queue<Integer> q) {
//         if (root == null) return;
//         this.addToQueue(root.left, q);
//         q.add(root.val);
//         this.addToQueue(root.right, q);
//     }
// }