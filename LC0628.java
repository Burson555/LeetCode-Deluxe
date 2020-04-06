// Runtime: 19 ms, faster than 5.89% of Java online submissions for Maximum Product of Three Numbers.
// Memory Usage: 51.8 MB, less than 7.14% of Java online submissions for Maximum Product of Three Numbers.

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int val_1 = nums[n-1] * nums[n-2] * nums[n-3];
        int val_2 = nums[n-1] * nums[0] * nums[1];
        return Integer.max(val_1, val_2);
    }
}