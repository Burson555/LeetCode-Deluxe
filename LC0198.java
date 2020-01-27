// Runtime: 6 ms, faster than 6.76% of Java online submissions for House Robber.
// Memory Usage: 37.7 MB, less than 5.26% of Java online submissions for House Robber.
// Runtime: 3 ms, faster than 20.44% of Java online submissions for Minimum Path Sum.
// Memory Usage: 42.6 MB, less than 68.92% of Java online submissions for Minimum Path Sum.

// PERFORMANCE VARIES
class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+3];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 0;
        for (int i = 3; i < dp.length; i++) {
            System.out.println(nums[i-3]);
            dp[i] = nums[i-3] + ((dp[i-2] > dp[i-3]) ? dp[i-2] : dp[i-3]);
            System.out.println(dp[i]);
        }
        return (dp[dp.length-1] > dp[dp.length-2]) ? dp[dp.length-1] : dp[dp.length-2];
    }
}