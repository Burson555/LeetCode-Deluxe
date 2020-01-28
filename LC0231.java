// Runtime: 1 ms, faster than 100.00% of Java online submissions for Power of Two.
// Memory Usage: 36.9 MB, less than 7.32% of Java online submissions for Power of Two.

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        int base = 1;
        int bound = (n <= Integer.MAX_VALUE/2) ? n : Integer.MAX_VALUE/2;
        while (base != n && base < bound)
            base *= 2;
        return (base == n) ? true : false;
    }
}