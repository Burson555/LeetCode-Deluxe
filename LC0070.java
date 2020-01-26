// Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
// Memory Usage: 36.3 MB, less than 5.26% of Java online submissions for Climbing Stairs.

class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            dp[i] = dp[i-2] + dp[i-1];
        return dp[n];
    }
}