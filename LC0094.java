// Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
// Memory Usage: 37.6 MB, less than 5.11% of Java online submissions for Binary Tree Inorder Traversal.

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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        List<Integer> rs = new LinkedList<>();
        while (root != null || !s.isEmpty()) {
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            rs.add(root.val);
            root = root.right;
        }
        return rs;
    }
}

// // Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
// // Memory Usage: 38.1 MB, less than 5.11% of Java online submissions for Binary Tree Inorder Traversal.
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
    
//     List<Integer> rs = new LinkedList<>();
    
//     public List<Integer> inorderTraversal(TreeNode root) {
//         this.visit(root);
//         return rs;
//     }
    
//     private void visit(TreeNode root) {
//         if (root == null) return;
//         this.visit(root.left);
//         rs.add(root.val);
//         this.visit(root.right);
//     }
    
// }