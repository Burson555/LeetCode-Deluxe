// The following is the cost after inserting two PRINT functions into the code.
// Runtime: 6 ms, faster than 6.76% of Java online submissions for House Robber.
// Memory Usage: 37.7 MB, less than 5.26% of Java online submissions for House Robber.
// Runtime: 3 ms, faster than 20.44% of Java online submissions for Minimum Path Sum.
// Memory Usage: 42.6 MB, less than 68.92% of Java online submissions for Minimum Path Sum.

// The following is the normal statistics.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
// Memory Usage: 36.6 MB, less than 5.26% of Java online submissions for House Robber.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
// Memory Usage: 37 MB, less than 5.26% of Java online submissions for House Robber.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
// Memory Usage: 37.1 MB, less than 5.26% of Java online submissions for House Robber.

// PERFORMANCE VARIES
class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+3];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 0;
        for (int i = 3; i < dp.length; i++)
            dp[i] = nums[i-3] + ((dp[i-2] > dp[i-3]) ? dp[i-2] : dp[i-3]);
        return (dp[dp.length-1] > dp[dp.length-2]) ? dp[dp.length-1] : dp[dp.length-2];
    }
}