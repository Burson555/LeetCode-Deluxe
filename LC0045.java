// Runtime: 1 ms, faster than 100.00% of Java online submissions for Jump Game II.
// Memory Usage: 40.7 MB, less than 63.46% of Java online submissions for Jump Game II.

class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int length = nums.length, low = 0, high = 0, max = 0, count = 0;
        while (max < length) {
            for (int i = low; i <= high; i++)
                max = (i+nums[i] > max) ? i+nums[i] : max;
            low     = high + 1;
            high    = max;
            count++;
            if (max == length-1) break;
        }
        return count;
    }
}



// // Runtime: 441 ms, faster than 5.01% of Java online submissions for Jump Game II.
// // Memory Usage: 40.6 MB, less than 63.46% of Java online submissions for Jump Game II.

// class Solution {
//     public int jump(int[] nums) {
//         int length = nums.length;
//         int dp[] = new int[length];
//         dp[0] = 0;
//         for (int i = 1; i < length; i++)
//             dp[i] = Integer.MAX_VALUE;
//         for (int i = 0; i < length; i++)
//             for (int j = i+1; j <= i+nums[i] && j < length; j++)
//                 dp[j] = (dp[i]+1 < dp[j]) ? dp[i]+1 : dp[j];
//         return dp[length-1];
//     }
// }