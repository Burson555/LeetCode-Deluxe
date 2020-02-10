// Runtime: 171 ms, faster than 7.76% of Java online submissions for Best Time to Buy and Sell Stock IV.
// Memory Usage: 38.4 MB, less than 25.00% of Java online submissions for Best Time to Buy and Sell Stock IV.

class Solution {
    public int maxProfit(int k, int[] prices) {
        if (k == 0 || prices.length == 0) return 0;
        int length = Math.min(k, (1+prices.length)/2);
        int buy[]   = new int[length];
        int sell[]  = new int[length];
        for (int i = 0; i < length; i++) {
            buy[i]  = Integer.MIN_VALUE;
            sell[i] = 0;
        }
        for (int i = 0; i < prices.length; i++) {
            buy[0]  = Math.max(buy[0], -prices[i]);
            sell[0] = Math.max(sell[0], buy[0] + prices[i]);
            for (int j = 1; j < length; j++) {
                buy[j]  = Math.max(buy[j], sell[j-1] - prices[i]);
                sell[j] = Math.max(sell[j], buy[j] + prices[i]);
            }
		}
        return sell[length-1];
    }
}