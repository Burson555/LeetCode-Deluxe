// TAKEAWAY:
// 		unlike Python, Java doesn't allow an array of multiple data types,
//		but we can consider a Java object as such kind of array.

// Runtime: 1 ms, faster than 91.06% of Java online submissions for Maximum Width of Binary Tree.
// Memory Usage: 39.4 MB, less than 11.11% of Java online submissions for Maximum Width of Binary Tree.

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
    
    int res = 0;
    Map<Integer, Integer> hm = new HashMap<>();
    // maps depth level to left most node index of that level
    
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        addInfo(root, 0, 0);
        return res+1;
    }
    
    private void addInfo(TreeNode root, int depth, int index) {
        if (!hm.containsKey(depth)) hm.put(depth, index);
        res = Integer.max(res, index-hm.get(depth));
        if (root.left != null) addInfo(root.left, depth+1, 1+2*index);
        if (root.right != null) addInfo(root.right, depth+1, 2+2*index);
    }
}



// // Runtime: 1 ms, faster than 91.06% of Java online submissions for Maximum Width of Binary Tree.
// // Memory Usage: 39.2 MB, less than 11.11% of Java online submissions for Maximum Width of Binary Tree.

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
//     public int widthOfBinaryTree(TreeNode root) {
//         if (root == null) return 0;
//         Queue<AnnotatedNode> q = new LinkedList<>();
//         int left_index = 0, max_width = 0, curr_depth = 0;
//         q.offer(new AnnotatedNode(root, 0, 0));
//         while (!q.isEmpty()) {
//             AnnotatedNode temp = q.poll();
//             // System.out.println(temp.node.val);
//             if (curr_depth == temp.depth) {
//                 max_width = Integer.max(max_width, temp.index-left_index);
//             } else {
//                 left_index = temp.index;
//                 curr_depth += 1;
//             }
//             if (temp.node.left != null) 
//                 q.offer(new AnnotatedNode(temp.node.left, curr_depth+1, 1+2*temp.index));
//             if (temp.node.right != null) 
//                 q.offer(new AnnotatedNode(temp.node.right, curr_depth+1, 2+2*temp.index));
//         }
//         return max_width+1;
//     }
    
//     class AnnotatedNode {
        
//         TreeNode node;
//         int depth;
//         int index;
        
//         public AnnotatedNode(TreeNode root, int depth, int index) {
//             this.node = root;
//             this.depth = depth;
//             this.index = index;
//         }
//     }
// }