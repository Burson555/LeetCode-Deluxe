// Runtime: 2 ms, faster than 90.84% of Java online submissions for Minimum Path Sum.
// Memory Usage: 42.9 MB, less than 56.76% of Java online submissions for Minimum Path Sum.

class Solution {
    public int minPathSum(int[][] grid) {
        int dp[] = new int[grid[0].length+1];
        dp[0] = Integer.MAX_VALUE;
        dp[1] = grid[0][0];
        for (int i = 2; i <= grid[0].length; i++)
            dp[i] = grid[0][i-1] + dp[i-1];
        for (int j = 1; j < grid.length; j++)
            for (int i = 1; i <= grid[0].length; i++)
                dp[i] = grid[j][i-1] + ((dp[i] < dp[i-1]) ? dp[i] : dp[i-1]);
        return dp[dp.length-1];
    }
}