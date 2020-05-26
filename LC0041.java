// Runtime: 0 ms, faster than 100.00% of Java online submissions for First Missing Positive.
// Memory Usage: 37.3 MB, less than 6.85% of Java online submissions for First Missing Positive.

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n;) {
            int curr = nums[i];
            if (curr > 0 && curr <= n && nums[curr-1] != curr)
                swap(nums, curr-1, i);
            if (nums[i] < 1 || nums[i] > n || nums[nums[i]-1] == nums[i]) i += 1;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i+1) return i+1;
        }
        return n+1;
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}