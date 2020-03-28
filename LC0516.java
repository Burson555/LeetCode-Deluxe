// Runtime: 40 ms, faster than 43.89% of Java online submissions for Longest Palindromic Subsequence.
// Memory Usage: 50.1 MB, less than 5.55% of Java online submissions for Longest Palindromic Subsequence.

class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) dp[i][i] = 1;
        for (int i = 0; i < n-1; i++) 
            dp[i][i+1] = (s.charAt(i) == s.charAt(i+1)) ? 2 : 1;
        for (int d = 3; d <= n; d++) {
            for (int i = 0; i < n-d+1; i++) {
                int j = i+d-1;
                if (s.charAt(i) == s.charAt(j)) 
                    dp[i][j] = dp[i+1][j-1] + 2;
                else dp[i][j] = Integer.max(dp[i+1][j], dp[i][j-1]);
            }
        }
        return dp[0][n-1];
    }
}