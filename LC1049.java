// Runtime: 1 ms, faster than 98.02% of Java online submissions for Last Stone Weight II.
// Memory Usage: 39.8 MB, less than 100.00% of Java online submissions for Last Stone Weight II.
// TIME COMLEXITY: O(STONES*TARGET)
// SPACE COMPLEXITY: O(TARGET)
class Solution {
    public int lastStoneWeightII(int[] stones) {
        int total = 0;
        for (int stone: stones)
            total += stone;
        int target = total/2;
        boolean dp[] = new boolean[target+1];
        dp[0] = true;
        for (int i = 0; i < stones.length; i++){
            for (int j = target; j >= stones[i]; j--)
                dp[j] |= dp[j-stones[i]];
        }
        for (int j = target; j >= 0; j--)
            if (dp[j])
                return Math.abs(total - 2*j);
        return 0;
    }
}


// Runtime: 2 ms, faster than 69.57% of Java online submissions for Last Stone Weight II.
// Memory Usage: 40 MB, less than 100.00% of Java online submissions for Last Stone Weight II.
// TIME COMLEXITY: O(STONES*TARGET)
// SPACE COMPLEXITY: O(TARGET)
// class Solution {
//     public int lastStoneWeightII(int[] stones) {
//         int sum = 0;
//         for (int n : stones)
//             sum += n;

//         int target = sum / 2;

//         int[] dp = new int[target+1];

//         for (int i = 0; i < stones.length; i++) {
//             for (int j = target; j >= stones[i]; j--) 
//                 dp[j] = Math.max(dp[j], dp[j-stones[i]]+stones[i]);
//         }
//         return Math.abs(sum - 2*dp[target]);
//     }
// }


// Runtime: 3 ms, faster than 44.86% of Java online submissions for Last Stone Weight II.
// Memory Usage: 40.5 MB, less than 100.00% of Java online submissions for Last Stone Weight II.
// TIME COMLEXITY: O(STONES*TARGET)
// SPACE COMPLEXITY: O(STONES*TARGET)
// class Solution {
//     public int lastStoneWeightII(int[] stones) {
//         int sum = 0;
//         for (int n : stones)
//             sum += n;

//         int target = sum / 2;
//         int[][] dp = new int[stones.length+1][target+1];

//         for (int i = 1; i < stones.length+1; i++) {
//             for (int j = 0; j <= target; j++) {
//                 if (stones[i-1] > j)
//                     dp[i][j] = dp[i-1][j];
//                 else
//                     dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-stones[i-1]]+stones[i-1]);
//             }
//         }
//         return Math.abs(sum - 2*dp[stones.length][target]);
//     }
// }