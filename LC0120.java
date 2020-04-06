// Runtime: 1 ms, faster than 98.10% of Java online submissions for Triangle.
// Memory Usage: 39.7 MB, less than 8.16% of Java online submissions for Triangle.

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int dp[] = new int[n];
        dp[0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (j == 0) dp[j] = dp[j] + triangle.get(i).get(j);
                else if (j == i) dp[j] = dp[j-1] + triangle.get(i).get(j);
                else dp[j] = Integer.min(dp[j-1], dp[j]) + triangle.get(i).get(j);
            }
        }
        int min = dp[0];
        for (int i = 1; i < n; i++)
            if (dp[i] < min)
                min = dp[i];
        return min;
    }
}


// space optimized version
// // Runtime: 7 ms, faster than 6.66% of Java online submissions for Triangle.
// // Memory Usage: 41 MB, less than 6.12% of Java online submissions for Triangle.

// class Solution {
//     public int minimumTotal(List<List<Integer>> triangle) {
//         int n = triangle.size();
//         int dp[][] = new int[n][n];
//         dp[0][0] = triangle.get(0).get(0);
//         for (int i = 1; i < n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 if (j == 0) dp[i][j] = dp[i-1][j] + triangle.get(i).get(j);
//                 else if (j == i) dp[i][j] = dp[i-1][j-1] + triangle.get(i).get(j);
//                 else dp[i][j] = Integer.min(dp[i-1][j-1], dp[i-1][j]) + triangle.get(i).get(j);
//             }
//         }
//         int min = dp[n-1][0];
//         for (int i = 1; i < n; i++)
//             if (dp[n-1][i] < min)
//                 min = dp[n-1][i];
//         return min;
//     }
// }