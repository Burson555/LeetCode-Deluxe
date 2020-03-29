// Runtime: 5 ms, faster than 82.28% of Java online submissions for Edit Distance.
// Memory Usage: 39.9 MB, less than 5.88% of Java online submissions for Edit Distance.

class Solution {
    public int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int dp[][] = new int[l1+1][l2+1];
        dp[0][0] = 0;
        for (int i = 1; i <= l2; i++) dp[0][i] = i;
        for (int i = 1; i <= l1; i++) dp[i][0] = i;
        int max_iter = Integer.min(l1, l2);
        for (int i = 1; i <= max_iter; i++) {
            for (int j = i; j <= l2; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = 1+Integer.min(dp[i][j-1], dp[i-1][j]);
                    dp[i][j] = Integer.min(1+dp[i-1][j-1], dp[i][j]);
                }
            }
            for (int j = i+1; j <= l1; j++) {
                if (word1.charAt(j-1) == word2.charAt(i-1)) {
                    dp[j][i] = dp[j-1][i-1];
                } else {
                    dp[j][i] = 1+Integer.min(dp[j][i-1], dp[j-1][i]);
                    dp[j][i] = Integer.min(1+dp[j-1][i-1], dp[j][i]);
                }
            }
        }
        return dp[l1][l2];
    }
}