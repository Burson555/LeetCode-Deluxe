// Runtime: 1 ms, faster than 97.27% of Java online submissions for Decode Ways.
// Memory Usage: 37.3 MB, less than 7.55% of Java online submissions for Decode Ways.

class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[s.length()+1];
        dp[0] = 1;
        char prev = '9';
        for (int i = 1; i <= s.length(); i++) {
            char c = s.charAt(i-1);
            if (c == '0'){
                if (prev == '0' || prev > '2')
                    return 0;
                dp[i] = dp[i-2];
            } else if (prev != '0' && (int)((prev-'0')*10+(c-'0')) < 27)
                dp[i] = dp[i-1] + dp[i-2];
            else 
                dp[i] = dp[i-1];
            prev = c;
        }
        return dp[s.length()];
    }
}