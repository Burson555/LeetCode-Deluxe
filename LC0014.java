// Runtime: 1 ms, faster than 73.03% of Java online submissions for Longest Common Prefix.
// Memory Usage: 36.7 MB, less than 99.42% of Java online submissions for Longest Common Prefix.
// Runtime: 1 ms, faster than 73.03% of Java online submissions for Longest Common Prefix.
// Memory Usage: 37.6 MB, less than 84.21% of Java online submissions for Longest Common Prefix.

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int num = strs.length, length = strs[0].length();
        if (num == 1) return strs[0];
        String lcp = "";
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            int j = 1;
            for (; j < strs.length; j++) {
                if (strs[j].length() == i) return lcp;
                if (strs[j].charAt(i) != c) break;
            }
            if (j == strs.length)
                lcp += strs[0].substring(i, i+1);
            else break;
        }
        return lcp;
    }
}

// How to divide and conquer?
// How to use binary search?
// How to use trie to solve the problem? How many cases?