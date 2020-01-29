// Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
// Memory Usage: 41.1 MB, less than 5.16% of Java online submissions for Convert Sorted Array to Binary Search Tree.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
// Memory Usage: 41.2 MB, less than 5.16% of Java online submissions for Convert Sorted Array to Binary Search Tree.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
// Memory Usage: 41.6 MB, less than 5.16% of Java online submissions for Convert Sorted Array to Binary Search Tree.

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
    
    int[] arr;
    
    public TreeNode sortedArrayToBST(int[] nums) {
        this.arr = nums;
        return this.toBST(0, this.arr.length-1);
    }
    
    private TreeNode toBST(int start, int end) {
        if (end < start) return null;
        if (end == start) return new TreeNode(this.arr[start]);
        int middle = (end-start)/2 + start;
        TreeNode head = new TreeNode(this.arr[middle]);
        head.left   = this.toBST(start, middle-1);
        head.right  = this.toBST(middle+1, end);
        return head;
    }
    
}