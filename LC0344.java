// Runtime: 1 ms, faster than 99.87% of Java online submissions for Reverse String.
// Memory Usage: 53.3 MB, less than 5.33% of Java online submissions for Reverse String.
// Runtime: 2 ms, faster than 13.36% of Java online submissions for Reverse String.
// Memory Usage: 53.2 MB, less than 5.33% of Java online submissions for Reverse String.
// Runtime: 1 ms, faster than 99.87% of Java online submissions for Reverse String.
// Memory Usage: 43.3 MB, less than 99.41% of Java online submissions for Reverse String.

class Solution {
    public void reverseString(char[] s) {
        int rp = s.length-1;
        for (int lp = 0; lp < rp; lp++) {
            char temp = s[lp];
            s[lp] = s[rp];
            s[rp--] = temp;
        }
    }
}