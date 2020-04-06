// SPACE OPTIMIZED
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Subarray.
// Memory Usage: 39.4 MB, less than 8.92% of Java online submissions for Maximum Subarray.

class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE, dp = Integer.MIN_VALUE;
        for (int i : nums) {
            dp = (dp > 0) ? dp+i : i;
            if (dp > res) res = dp;
        }
        return res;
    }
}


// Runtime: 2 ms, faster than 12.45% of Java online submissions for Maximum Subarray.
// Memory Usage: 42.2 MB, less than 5.16% of Java online submissions for Maximum Subarray.

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length, res = nums[0];
        int dp[] = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = (dp[i-1] > 0) ? dp[i-1] + nums[i] : nums[i];
            if (dp[i] > res) res = dp[i];
        }
        return res;
    }
}

// // Runtime: 1 ms, faster than 64.09% of Java online submissions for Maximum Subarray.
// // Memory Usage: 42 MB, less than 5.16% of Java online submissions for Maximum Subarray.

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max_sum = nums[0];
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             count = nums[i] + ((count >= 0) ? count : 0);
//             max_sum = (count > max_sum) ? count : max_sum;

//         }
//         return max_sum;
//     }
// }


// // Runtime: 1 ms, faster than 64.09% of Java online submissions for Maximum Subarray.
// // Memory Usage: 42 MB, less than 5.16% of Java online submissions for Maximum Subarray.

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max_val = nums[0];
//         int max_sum = nums[0];
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             max_val = (nums[i] > max_val) ? nums[i] : max_val;
//             if (nums[i] >=0) 
//                 count = (count <= 0) ? nums[i] : (count+nums[i]);
//             else {
//                 if (count > 0) max_sum = (count > max_sum) ? count : max_sum;
//                 count = count + nums[i];
//                 count = (count <= 0 && max_val > 0) ? 0 : count;
//             }
//         }
//         max_sum = (max_sum > count) ? max_sum : count;
//         max_sum = (max_sum > max_val) ? max_sum : max_val;
//         return max_sum;
//     }
// }