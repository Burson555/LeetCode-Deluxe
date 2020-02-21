// Runtime: 26 ms, faster than 54.13% of Java online submissions for Longest Palindromic Substring.
// Memory Usage: 41.5 MB, less than 7.26% of Java online submissions for Longest Palindromic Substring.
// Runtime: 27 ms, faster than 52.75% of Java online submissions for Longest Palindromic Substring.
// Memory Usage: 41.5 MB, less than 7.26% of Java online submissions for Longest Palindromic Substring.

class Solution {
    public String longestPalindrome(String s) {
        String rs = "";
        if (s == null || s.length() == 0) return rs;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.charAt(i-1) == c) {
                int j = 1;
                while (i-1-j >=0 && i+1+j <= s.length()) {
                    if (s.charAt(i-1-j) == s.charAt(i+j)) j++;
                    else break;
                }
                --j;
                String ts = s.substring(i-1-j, i+1+j);
                if (ts.length() > rs.length()) rs = ts;
            }
            if (i-2 >=0 && s.charAt(i-2) == c) {
                int j = 1;
                while (i-2-j >=0 && i+1+j <= s.length()) {
                    if (s.charAt(i-2-j) == s.charAt(i+j)) j++;
                    else break;
                }
                --j;
                String ts = s.substring(i-2-j, i+1+j);
                if (ts.length() > rs.length()) rs = ts;
            }
        }
        return (rs.length() == 0) ? s.substring(0, 1) : rs;
    }
}