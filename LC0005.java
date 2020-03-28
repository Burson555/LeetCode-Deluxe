// Runtime: 20 ms, faster than 91.81% of Java online submissions for Longest Palindromic Substring.
// Memory Usage: 37.9 MB, less than 52.02% of Java online submissions for Longest Palindromic Substring.

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";
        int center = 0, max_len = 0;
        for (int i = 0; i < n; i++) {
            int temp = calc(s, n, i, i);
            if (temp > max_len) {
                center = i;
                max_len = temp;
            }
            if (i < n-1) {
                temp = calc(s, n, i, i+1);
                if (temp > max_len) {
                    center = i;
                    max_len = temp;
                }
            }
        }
        return s.substring(center-(max_len-1)/2, center+1+max_len/2);
    }
    
    private int calc(String s, int length, int l, int r) {
        while (l >= 0 && r < length && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r-l-1;
    }
}

// // Runtime: 26 ms, faster than 54.13% of Java online submissions for Longest Palindromic Substring.
// // Memory Usage: 41.5 MB, less than 7.26% of Java online submissions for Longest Palindromic Substring.
// // Runtime: 27 ms, faster than 52.75% of Java online submissions for Longest Palindromic Substring.
// // Memory Usage: 41.5 MB, less than 7.26% of Java online submissions for Longest Palindromic Substring.

// class Solution {
//     public String longestPalindrome(String s) {
//         String rs = "";
//         if (s == null || s.length() == 0) return rs;
//         for (int i = 1; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (s.charAt(i-1) == c) {
//                 int j = 1;
//                 while (i-1-j >=0 && i+1+j <= s.length()) {
//                     if (s.charAt(i-1-j) == s.charAt(i+j)) j++;
//                     else break;
//                 }
//                 --j;
//                 String ts = s.substring(i-1-j, i+1+j);
//                 if (ts.length() > rs.length()) rs = ts;
//             }
//             if (i-2 >=0 && s.charAt(i-2) == c) {
//                 int j = 1;
//                 while (i-2-j >=0 && i+1+j <= s.length()) {
//                     if (s.charAt(i-2-j) == s.charAt(i+j)) j++;
//                     else break;
//                 }
//                 --j;
//                 String ts = s.substring(i-2-j, i+1+j);
//                 if (ts.length() > rs.length()) rs = ts;
//             }
//         }
//         return (rs.length() == 0) ? s.substring(0, 1) : rs;
//     }
// }