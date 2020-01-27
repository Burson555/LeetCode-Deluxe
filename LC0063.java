// Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths II.
// Memory Usage: 37.3 MB, less than 100.00% of Java online submissions for Unique Paths II.

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[] = new int[obstacleGrid[0].length+1];
        dp[0] = 0;
        dp[1] = (obstacleGrid[0][0] != 1) ? 1 : 0;
        for (int i = 2; i < dp.length; i++)
            dp[i] = (obstacleGrid[0][i-1] != 1) ? dp[i-1] : 0;
        for (int j = 1; j < obstacleGrid.length; j++) 
            for (int i = 1; i < dp.length; i++)
                dp[i] = (obstacleGrid[j][i-1] != 1) ? dp[i-1]+dp[i] : 0;
        return dp[dp.length-1];
    }
}