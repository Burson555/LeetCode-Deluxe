// Runtime: 0 ms, faster than 100.00% of Java online submissions for Hamming Distance.
// Memory Usage: 36.3 MB, less than 5.09% of Java online submissions for Hamming Distance.

class Solution {
    public int hammingDistance(int x, int y) {
        int res = x^y, count = 0, mask  = 1;
        for (int i = 0; i < 32; i++){
            if ((res & mask) != 0) count++;
            mask <<= 1;
        }
        return count;
    }
}