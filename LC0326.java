// Runtime: 11 ms, faster than 90.71% of Java online submissions for Power of Three.
// Memory Usage: 40.6 MB, less than 6.25% of Java online submissions for Power of Three.

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        int base = 1;
        while (base != n && base < n && base <= Integer.MAX_VALUE/3)
            base = base*3;
        return (base == n) ? true : false;
    }
}