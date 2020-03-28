// Runtime: 10 ms, faster than 69.57% of Java online submissions for Longest Common Subsequence.
// Memory Usage: 43.7 MB, less than 100.00% of Java online submissions for Longest Common Subsequence.

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        if (l1 == 0 || l2 == 0) return 0;
        int dp[][] = new int[l1+1][l2+1];
        for (int i = 0; i <= l1; i++) dp[i][0] = 0;
        for (int i = 0; i <= l2; i++) dp[0][i] = 0;
        int num_iter = Integer.min(l1, l2);
        for (int i = 1; i <= num_iter; i++) {
            for (int j = i; j <= l2; j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = Integer.max(dp[i-1][j], dp[i][j-1]);
            }
            for (int j = i+1; j <= l1; j++) {
                if (text1.charAt(j-1) == text2.charAt(i-1)) dp[j][i] = dp[j-1][i-1]+1;
                else dp[j][i] = Integer.max(dp[j-1][i], dp[j][i-1]);
            }
        }
        return dp[l1][l2];
    }
}