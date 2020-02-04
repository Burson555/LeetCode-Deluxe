// Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Increasing Subsequence.
// Memory Usage: 36.9 MB, less than 43.00% of Java online submissions for Longest Increasing Subsequence.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Increasing Subsequence.
// Memory Usage: 37.4 MB, less than 34.00% of Java online submissions for Longest Increasing Subsequence.

class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int index = Arrays.binarySearch(dp, 0, len, num);
            if (index < 0) index = -index - 1;
            dp[index] = num;
            if (len == index) len++;
        }
        return len;
    }
}


// // Runtime: 16 ms, faster than 24.69% of Java online submissions for Longest Increasing Subsequence.
// // Memory Usage: 39.5 MB, less than 5.00% of Java online submissions for Longest Increasing Subsequence.
// // Runtime: 20 ms, faster than 19.67% of Java online submissions for Longest Increasing Subsequence.
// // Memory Usage: 39.5 MB, less than 5.00% of Java online submissions for Longest Increasing Subsequence.
// // Runtime: 15 ms, faster than 29.01% of Java online submissions for Longest Increasing Subsequence.
// // Memory Usage: 39.4 MB, less than 5.00% of Java online submissions for Longest Increasing Subsequence.

// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         if (nums.length == 0) return 0;
//         int dp[] = new int[nums.length];
//         dp[0] = 1;
//         int max;
//         for (int i = 1; i < nums.length; i++) {
//             max = 1;
//             for (int j = 0; j < i; j++)
//                 if(nums[i] > nums[j])
//                     max = (dp[j]+1 > max) ? dp[j]+1 : max;
//             dp[i] = max;
//         }
//         max = 1;
//         for (int i = 0; i < nums.length; i++)
//             if (dp[i] > max) max=dp[i];
//         return max;
//     }
// }