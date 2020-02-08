// Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Array.
// Memory Usage: 41.8 MB, less than 5.77% of Java online submissions for Rotate Array.

class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        this.reverse(nums, 0, length-k-1);
        this.reverse(nums, length-k, length-1);
        this.reverse(nums, 0, length-1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}