// Runtime: 1 ms, faster than 99.79% of Java online submissions for Reverse Bits.
// Memory Usage: 38.3 MB, less than 7.32% of Java online submissions for Reverse Bits.
// Runtime: 1 ms, faster than 99.79% of Java online submissions for Reverse Bits.
// Memory Usage: 38.1 MB, less than 7.32% of Java online submissions for Reverse Bits.

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int mask = 1, res = 0;
        for (int i = 1; i < 32; i++) {
            if ((mask&n) != 0) res += 1;
            mask <<= 1;
            res <<= 1;
        }
        return ((mask&n) != 0) ? res+1 : res;
    }
}