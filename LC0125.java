// Runtime: 6 ms, faster than 47.98% of Java online submissions for Valid Palindrome.
// Memory Usage: 40.4 MB, less than 18.75% of Java online submissions for Valid Palindrome.
// Runtime: 2 ms, faster than 99.55% of Java online submissions for Valid Palindrome.
// Memory Usage: 38.9 MB, less than 67.86% of Java online submissions for Valid Palindrome.
// Runtime: 3 ms, faster than 95.96% of Java online submissions for Valid Palindrome.
// Memory Usage: 40.6 MB, less than 16.07% of Java online submissions for Valid Palindrome.
// Runtime: 2 ms, faster than 99.55% of Java online submissions for Valid Palindrome.
// Memory Usage: 38.7 MB, less than 72.32% of Java online submissions for Valid Palindrome.

// One advatage our program is that we will not change the content of the string.
// However, in isPalindrome(String s), we pass the reference of a string to the program,
//      which means we can access the content of the string object.
//      If we try to modify the content of the string, we will be able to modify it.
class Solution {
    public boolean isPalindrome(String s) {
        int lp = 0, rp = s.length()-1;
        while (lp < rp) {
            char l;
            if (this.isUpper(s.charAt(lp))) {
                l = (char)('a' + s.charAt(lp) - 'A');
            } else if (this.isValid(s.charAt(lp))) {
                l = s.charAt(lp);
            } else {
                lp++;
                continue;
            }
            char r;
            if (this.isUpper(s.charAt(rp))) {
                r = (char)('a' + s.charAt(rp) - 'A');
            } else if (this.isValid(s.charAt(rp))) {
                r = s.charAt(rp);
            } else {
                rp--;
                continue;
            }
            if (r != l) return false;
            lp++;
            rp--;
        }
        return true;
    }
    
    private boolean isUpper(char c) {
        return (c >= 'A' && c <= 'Z');
    }
    
    private boolean isValid(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}