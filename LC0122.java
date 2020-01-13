// Unlike the most basic buy and sell problem, if we use brute force here,
// time complexity will grow exponentially.
// ONE TAKEAWAY is draw the graph before doing the problem, when it is simple to draw.
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int net_value = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] < prices[i+1]) 
                net_value += prices[i+1] - prices[i];
        }
        return net_value;
    }
}