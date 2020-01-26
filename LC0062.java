// Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.
// Memory Usage: 36.4 MB, less than 5.10% of Java online submissions for Unique Paths.

class Solution {
    public int uniquePaths(int m, int n) {
        int dp[] = new int[m];
        for (int i = 0; i < m; i++)
            dp[i] = 1;
        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++)
                dp[j] = dp[j] + dp[j-1];
        return dp[m-1];
    }
}