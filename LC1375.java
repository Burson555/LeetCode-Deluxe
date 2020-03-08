// Runtime: 1 ms, faster than 100.00% of Java online submissions for Bulb Switcher III.
// Memory Usage: 51.3 MB, less than 100.00% of Java online submissions for Bulb Switcher III.

class Solution {
    public int numTimesAllBlue(int[] light) {
        int rp = light[0], count = 0, res = 0;
        for (int i : light) {
            count += 1;
            if (i > rp) rp = i;
            if (count == rp) res += 1;
        }
        return res;
    }
}