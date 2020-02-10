// Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of 1 Bits.
// Memory Usage: 36.6 MB, less than 5.41% of Java online submissions for Number of 1 Bits.

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) count++;
            mask <<= 1;
        }
        return count;
    }
}