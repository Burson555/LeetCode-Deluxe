// Of course, brute force also works on this problem
// WITH time complexity if O(n^2) and space complexity of O(1)
// HOWEVER, this solution has time complexity of O(n)
//      and space complexity of O(1)
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int min_price = prices[0];
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_price)
                min_price = prices[i];
            else if (prices[i] - min_price > max_profit)
                max_profit = prices[i] - min_price;
        }
        return max_profit;
    }
}