// Runtime: 1 ms, faster than 100.00% of Java online submissions for Power of Four.
// Memory Usage: 36.8 MB, less than 6.67% of Java online submissions for Power of Four.

class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        int base = 1, bound = (num <= Integer.MAX_VALUE/4) ? num : Integer.MAX_VALUE/4;
        while (base != num && base < bound)
            base *= 4;
        return (base == num) ? true : false;
    }
}