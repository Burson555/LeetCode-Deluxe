// Runtime: 557 ms, faster than 25.00% of Java online submissions for Minimum Cost to Make at Least One Valid Path in a Grid.
// Memory Usage: 42.9 MB, less than 100.00% of Java online submissions for Minimum Cost to Make at Least One Valid Path in a Grid.

class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                dp[i][j] = m+n-2;
        dp[0][0] = 0;
        for (int k = 0; k < m*n/2; k++) {
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (this.checkValid(m, n, i, j+1)) {
                        int temp;
                        if (grid[i][j] == 1) temp = Integer.min(dp[i][j+1], dp[i][j]);
                        else temp = Integer.min(dp[i][j+1], dp[i][j]+1);
                        if (temp < dp[i][j+1]) {
                            dp[i][j+1] = temp;
                            count++;
                        }
                    }
                    if (this.checkValid(m, n, i, j-1)) {
                        int temp;
                        if (grid[i][j] == 2) temp = Integer.min(dp[i][j-1], dp[i][j]);
                        else temp = Integer.min(dp[i][j-1], dp[i][j]+1);
                        if (temp < dp[i][j-1]) {
                            dp[i][j-1] = temp;
                            count++;
                        }
                    }
                    if (this.checkValid(m, n, i+1, j)) {
                        int temp;
                        if (grid[i][j] == 3) temp = Integer.min(dp[i+1][j], dp[i][j]);
                        else temp = Integer.min(dp[i+1][j], dp[i][j]+1);
                        if (temp < dp[i+1][j]) {
                            dp[i+1][j] = temp;
                            count++;
                        }
                    }
                    if (this.checkValid(m, n, i-1, j)) {
                        int temp;
                        if (grid[i][j] == 4) temp = Integer.min(dp[i-1][j], dp[i][j]);
                        else temp = Integer.min(dp[i-1][j], dp[i][j]+1);
                        if (temp < dp[i-1][j]) {
                            dp[i-1][j] = temp;
                            count++;
                        }
                    }
                }
            }
            if (count == 0) break;
        }
        return dp[m-1][n-1];
    }
    
    private boolean checkValid(int m, int n, int i, int j) {
        return (0 <= i && i < m && 0 <= j && j < n);
    }
}