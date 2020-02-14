// Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Integer.
// Memory Usage: 36.9 MB, less than 5.55% of Java online submissions for Reverse Integer.

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int last = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && last > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && last < -8)) return 0;
            rev = rev*10 + last;
        }
        return rev;
    }
}