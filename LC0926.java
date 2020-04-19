// Runtime: 2 ms, faster than 99.78% of Java online submissions for Flip String to Monotone Increasing.
// Memory Usage: 39.3 MB, less than 20.00% of Java online submissions for Flip String to Monotone Increasing.

class Solution {
    public int minFlipsMonoIncr(String S) {
        int n = S.length();
        int res = 0;
        for (int i = 0; i < n; i++)
            if (S.charAt(i) == '0')
                res += 1;
        int min = res;
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == '1') res += 1;
            else res -= 1;
            min = (res < min) ? res : min;
        }
        return min;
    }
}