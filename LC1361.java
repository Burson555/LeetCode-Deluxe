// Runtime: 2 ms, faster than 100.00% of Java online submissions for Validate Binary Tree Nodes.
// Memory Usage: 42.7 MB, less than 100.00% of Java online submissions for Validate Binary Tree Nodes.

class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int num_edges = 0;
        for (int i = 0; i < rightChild.length; i++) {
            if (leftChild[i] != -1) num_edges++;
            if (rightChild[i] != -1) num_edges++;
        }
        if (num_edges != n-1) return false;
        
        // find root
        int index = 0;
        for (int i = 0; i < rightChild.length; i++) {
            if (leftChild[i] == -1 && rightChild[i] == -1) {
                index = i;
                break;
            }
        }
        int i = 0;
        while (i != rightChild.length){
            // System.out.println(index);
            for (i = 0; i < rightChild.length; i++) {
                if (leftChild[i] == index || rightChild[i] == index) {
                    index = i;
                    break;
                }
            }
        }
        
        // count nodes under root
        // System.out.println(index);
        int num_nodes = this.countNodes(leftChild, rightChild, index);
        // System.out.println(num_nodes);
        if (num_nodes != n) return false;
        return true;
    }
    
    private int countNodes(int[] leftChild, int[] rightChild, int index) {
        int count = 1;
        if (leftChild[index] == -1 && rightChild[index] == -1) return count;
        if (leftChild[index] != -1) count += this.countNodes(leftChild, rightChild, leftChild[index]);
        if (rightChild[index] != -1) count += this.countNodes(leftChild, rightChild, rightChild[index]);
        // System.out.println(index+"\t"+count);
        return count;
    }
}