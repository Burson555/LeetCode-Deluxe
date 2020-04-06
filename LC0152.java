// space optimized solution
// Runtime: 2 ms, faster than 24.81% of Java online submissions for Maximum Product Subarray.
// Memory Usage: 40.8 MB, less than 8.54% of Java online submissions for Maximum Product Subarray.

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int dp[] = new int[2];
        dp[0] = (nums[0] >= 0) ? nums[0] : 0;
        dp[1] = (nums[0] >= 0) ? 0 : nums[0];
        int res = dp[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] >= 0) {
                dp[0] = Integer.max(dp[0]*nums[i], nums[i]);
                dp[1] = dp[1]*nums[i];
            } else {
                int temp = dp[0];
                dp[0] = dp[1]*nums[i];
                dp[1] = Integer.min(temp*nums[i], nums[i]);
            }
            if (dp[0] > res) res = dp[0];
        }
        return res;
    }
}


// // Runtime: 2 ms, faster than 24.81% of Java online submissions for Maximum Product Subarray.
// // Memory Usage: 39.6 MB, less than 8.54% of Java online submissions for Maximum Product Subarray.

// class Solution {
//     public int maxProduct(int[] nums) {
//         int n = nums.length;
//         if (n == 0) return 0;
//         if (n == 1) return nums[0];
//         int dp[][] = new int[n][2];
//         dp[0][0] = (nums[0] >= 0) ? nums[0] : 0;
//         dp[0][1] = (nums[0] >= 0) ? 0 : nums[0];
//         for (int i = 1; i < n; i++) {
//             if (nums[i] >= 0) {
//                 dp[i][0] = Integer.max(dp[i-1][0]*nums[i], nums[i]);
//                 dp[i][1] = dp[i-1][1]*nums[i];
//             } else {
//                 dp[i][0] = dp[i-1][1]*nums[i];
//                 dp[i][1] = Integer.min(dp[i-1][0]*nums[i], nums[i]);
//             }
//         }
//         int res = dp[0][0];
//         for (int i = 1; i < n; i++)
//             if (dp[i][0] > res)
//                 res = dp[i][0];
//         return res;
//     }
// }