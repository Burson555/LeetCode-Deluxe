// Runtime: 3 ms, faster than 40.06% of Java online submissions for Jump Game.
// Memory Usage: 43.1 MB, less than 11.11% of Java online submissions for Jump Game.
// Runtime: 1 ms, faster than 97.28% of Java online submissions for Jump Game.
// Memory Usage: 40.7 MB, less than 56.41% of Java online submissions for Jump Game.
// Runtime: 4 ms, faster than 38.37% of Java online submissions for Jump Game.
// Memory Usage: 43.5 MB, less than 10.26% of Java online submissions for Jump Game.

class Solution {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        boolean dp[] = new boolean[length];
        for (int i = 1; i < length; i++)
            dp[i] = false;
        dp[0] = true;
        for (int i = 0; i < length; i++) {
            if (i + nums[i] < length && dp[i + nums[i]] == true) continue;
            for (int j = 1; j <= nums[i] && j+i < length; j++)
                dp[j+i] = dp[i];
        }
        return dp[dp.length-1];
    }
}