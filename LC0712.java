// Runtime: 17 ms, faster than 74.35% of Java online submissions for Minimum ASCII Delete Sum for Two Strings.
// Memory Usage: 40.2 MB, less than 10.00% of Java online submissions for Minimum ASCII Delete Sum for Two Strings.

class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int dp[][] = new int[l1+1][l2+1];
        dp[0][0] = 0;
        for (int i = 1; i <= l2; i++) 
            dp[0][i] = dp[0][i-1] + (int)s2.charAt(i-1);
        for (int i = 1; i <= l1; i++) 
            dp[i][0] = dp[i-1][0] + (int)s1.charAt(i-1);
        int max_iter = Integer.min(l1, l2);
        for (int i = 1; i <= max_iter; i++) {
            for (int j = i; j <= l2; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
                else dp[i][j] = Integer.min(dp[i][j-1]+(int)s2.charAt(j-1), 
                                            dp[i-1][j]+(int)s1.charAt(i-1));
            }
            for (int j = i+1; j <= l1; j++) {
                if (s1.charAt(j-1) == s2.charAt(i-1)) dp[j][i] = dp[j-1][i-1];
                else dp[j][i] = Integer.min(dp[j][i-1]+(int)s2.charAt(i-1), 
                                            dp[j-1][i]+(int)s1.charAt(j-1));
            }
        }
        return dp[l1][l2];
    }
}