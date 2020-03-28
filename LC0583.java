// Runtime: 7 ms, faster than 87.66% of Java online submissions for Delete Operation for Two Strings.
// Memory Usage: 40.6 MB, less than 11.76% of Java online submissions for Delete Operation for Two Strings.

class Solution {
    public int minDistance(String word1, String word2) {
        // find longest common subsequence
        int l1 = word1.length();
        int l2 = word2.length();
        if (l1 == 0 || l2 == 0) return l1 + l2;
        int dp[][] = new int[l1+1][l2+1];
        for (int i = 0; i <= l1; i++) dp[i][0] = 0;
        for (int i = 0; i <= l2; i++) dp[0][i] = 0;
        int max_iter = Integer.min(l1, l2);
        for (int i = 1; i <= max_iter; i++) {
            // iterate through line
            for (int j = i; j <= l2; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Integer.max(dp[i-1][j], dp[i][j-1]);
            }
            // iterate through row
            for (int j = i+1; j <= l1; j++) {
                if (word1.charAt(j-1) == word2.charAt(i-1))
                    dp[j][i] = dp[j-1][i-1] + 1;
                else dp[j][i] = Integer.max(dp[j-1][i], dp[j][i-1]);
            }
        }
        // return result
        return l1 + l2 - 2*dp[l1][l2];
    }
}