// Runtime: 1 ms, faster than 64.64% of Java online submissions for Implement strStr().
// Memory Usage: 37.8 MB, less than 67.17% of Java online submissions for Implement strStr().
// Runtime: 1 ms, faster than 64.64% of Java online submissions for Implement strStr().
// Memory Usage: 37.9 MB, less than 66.41% of Java online submissions for Implement strStr().

class Solution {
    public int strStr(String haystack, String needle) {
        
        if (needle == null || needle.length() == 0) return 0;
        
        int diff = haystack.length() - needle.length(), nl = needle.length();
        
        for (int i = 0; i <= diff; i++) {
            int j = i;
            for (; j < nl+i; j++)
                if (haystack.charAt(j) != needle.charAt(j-i))
                    break;
            if (j == nl+i) return i;
        }
        
        return -1;
        
    }
}