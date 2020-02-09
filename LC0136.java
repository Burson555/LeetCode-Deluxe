// Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.
// Memory Usage: 42.3 MB, less than 5.19% of Java online submissions for Single Number.

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i : nums)
            res ^= i;
        return res;
    }
}