// Runtime: 7 ms, faster than 98.22% of Java online submissions for Contiguous Array.
// Memory Usage: 48.6 MB, less than 100.00% of Java online submissions for Contiguous Array.

class Solution {
    public int findMaxLength(int[] nums) {
        final int n = nums.length;
        int count = 0;
        int dp[] = new int[2*n+1];
        Arrays.fill(dp, -1);
        dp[n] = 0;
        int max_len = 0;
        for (int i = 1; i <= n; i++) {
            count += (nums[i-1] == 0) ? -1 : 1;
            if (dp[count+n] == -1) dp[count+n] = i;
            else {
                if (i - dp[count+n] > max_len)
                    max_len = i - dp[count+n];
            }
        }
        return max_len;
    }
}