// Runtime: 12 ms, faster than 24.22% of Java online submissions for Palindromic Substrings.
// Memory Usage: 39.9 MB, less than 7.60% of Java online submissions for Palindromic Substrings.

class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int count = 0;
        boolean dp[][] = new boolean[n][n];
        for (int i = 0; i < n; i++) dp[i][i] = true;
        count += n;
        for (int i = 0; i < n-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                dp[i][i+1] = true;
                count += 1;
            }
        }
        for (int d = 3; d <= n; d++) {
            for (int i = 0; i < n-d+1; i++) {
                int j = i+d-1;
                dp[i][j] = (s.charAt(i) == s.charAt(j)) ? dp[i+1][j-1] : false;
                if (dp[i][j]) count += 1;
            }
        }
        return count;
    }
}

// // Runtime: 2 ms, faster than 94.08% of Java online submissions for Palindromic Substrings.
// // Memory Usage: 37.5 MB, less than 16.46% of Java online submissions for Palindromic Substrings.

// class Solution {
//     public int countSubstrings(String s) {
//         int length = s.length();
//         if (length == 0) return 0;
//         int count = 0;
//         for (int i = 0; i < length; i++) {
//             count += calc(s, length, i, i);
//             if (i < length-1) count += calc(s, length, i, i+1);
//         }
//         return count;
//     }
    
//     private int calc(String s, int length, int l, int r) {
//         int count = 0;
//         while (l >= 0 && r < length && s.charAt(l) == s.charAt(r)) {
//             count++;
//             l--;
//             r++;
//         }
//         return count;
//     }
// }