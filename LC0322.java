

// Runtime: 14 ms, faster than 51.54% of Java online submissions for Coin Change.
// Memory Usage: 40.6 MB, less than 5.33% of Java online submissions for Coin Change.
// Runtime: 14 ms, faster than 51.54% of Java online submissions for Coin Change.
// Memory Usage: 40.5 MB, less than 5.33% of Java online submissions for Coin Change.

// A smarter initialization can save us much.
class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount <= 0) return 0;
        int dp[] = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++)
            for (int j = 0; j < coins.length; j++) 
                if (i - coins[j] >= 0)
                    dp[i] = (dp[i - coins[j]]+1 >= dp[i]) ? dp[i] : dp[i - coins[j]]+1;
        return (dp[amount] == amount+1) ? -1 : dp[amount];
    }
}


// // Runtime: 18 ms, faster than 31.67% of Java online submissions for Coin Change.
// // Memory Usage: 40.9 MB, less than 5.33% of Java online submissions for Coin Change.
// // Runtime: 18 ms, faster than 31.67% of Java online submissions for Coin Change.
// // Memory Usage: 41 MB, less than 5.33% of Java online submissions for Coin Change.


// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         int dp[] = new int[amount+1];
//         for (int i = 0; i <= amount; i++)
//             dp[i] = -1;
//         dp[0] = 0;
//         for (int i = 1; i <= amount; i++) {
//             for (int j = 0; j < coins.length; j++) {
//                 if (i - coins[j] > 0 && dp[i - coins[j]] != -1){
//                     if (dp[i] != -1)
//                         dp[i] = (dp[i - coins[j]]+1 >= dp[i]) ? dp[i] : dp[i - coins[j]]+1;
//                     else
//                         dp[i] = dp[i - coins[j]]+1;
//                 } else if (i - coins[j] == 0)
//                     dp[i] = 1;
//             }
//         }
//         return dp[amount];
//     }
// }