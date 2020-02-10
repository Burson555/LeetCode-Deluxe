// Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
// Memory Usage: 38.2 MB, less than 69.39% of Java online submissions for Symmetric Tree.

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
    public boolean isSymmetric(TreeNode root) {
        return this.compareTree(root, root);
    }
    
    private boolean compareTree(TreeNode ln, TreeNode rn) {
        if (ln == null && rn == null) return true;
        if (ln == null || rn == null) return false;
        return (ln.val == rn.val) 
            && this.compareTree(ln.left, rn.right) 
            && this.compareTree(ln.right, rn.left);
    }
}


// // Runtime: 1 ms, faster than 29.36% of Java online submissions for Symmetric Tree.
// // Memory Usage: 38.4 MB, less than 61.90% of Java online submissions for Symmetric Tree.
// // Runtime: 1 ms, faster than 29.36% of Java online submissions for Symmetric Tree.
// // Memory Usage: 38.4 MB, less than 61.90% of Java online submissions for Symmetric Tree.

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
//     public boolean isSymmetric(TreeNode root) {
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
//         q.add(root);
//         while (!q.isEmpty()) {
//             TreeNode temp1 = q.remove();
//             TreeNode temp2 = q.remove();
//             if (temp1 == null && temp2 == null) continue;
//             if (temp1 == null || temp2 == null) return false;
//             if (temp1.val != temp2.val) return false;
//             q.add(temp1.left);
//             q.add(temp2.right);
//             q.add(temp1.right);
//             q.add(temp2.left);
//         }
//         return true;
//     }
// }


// // Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
// // Memory Usage: 38.2 MB, less than 71.43% of Java online submissions for Symmetric Tree.
// // Runtime: 1 ms, faster than 29.36% of Java online submissions for Symmetric Tree.
// // Memory Usage: 38.5 MB, less than 58.50% of Java online submissions for Symmetric Tree.
// // Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
// // Memory Usage: 38 MB, less than 72.11% of Java online submissions for Symmetric Tree.

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
//     public boolean isSymmetric(TreeNode root) {
//         if (root == null) return true;
//         if (root.left == null && root.right == null) return true;
//         if (root.left == null || root.right == null) return false;
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root.left);
//         q.add(root.right);
//         while (!q.isEmpty()) {
//             TreeNode temp1 = q.remove();
//             TreeNode temp2 = q.remove();
//             if (temp1 == null && temp2 == null) continue;
//             if (temp1 == null || temp2 == null) return false;
//             if (temp1.val != temp2.val) return false;
//             q.add(temp1.left);
//             q.add(temp2.right);
//             q.add(temp1.right);
//             q.add(temp2.left);
//         }
//         return true;
//     }
// }


// // Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
// // Memory Usage: 38 MB, less than 72.11% of Java online submissions for Symmetric Tree.

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
//     public boolean isSymmetric(TreeNode root) {
//         if (root == null) return true;
//         if (root.left == null && root.right == null) return true;
//         if (root.left == null || root.right == null) return false;
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root.left);
//         q.add(root.right);
//         while (!q.isEmpty()) {
//             TreeNode temp1 = q.remove();
//             TreeNode temp2 = q.remove();
//             if (temp1.val == temp2.val) {
//                 if (temp1.left != null && temp2.right != null) {
//                     q.add(temp1.left);
//                     q.add(temp2.right);
//                 } else if (temp1.left == null && temp2.right == null) {
//                 } else {
//                     return false;
//                 }
//                 if (temp1.right != null && temp2.left != null) {
//                     q.add(temp1.right);
//                     q.add(temp2.left);
//                 } else if (temp1.right == null && temp2.left == null) {
//                 } else {
//                     return false;
//                 }
//             } else {
//                 return false;
//             }
//         }
//         return true;
//     }
// }