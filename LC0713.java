// Runtime: 7 ms, faster than 97.49% of Java online submissions for Subarray Product Less Than K.
// Memory Usage: 49.5 MB, less than 100.00% of Java online submissions for Subarray Product Less Than K.

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, count = 0, temp = 1, start = 0;
        for (int end = 1; end <= n; end++) {
            temp *= nums[end-1];
            while (temp >= k && start < end) temp /= nums[start++];
            count += (end - start);
        }
        return count;
    }
}