// Like the most basic buy and sell problem, we can use brute force here,
// which can guarrantee us a time complexity of n^3.
// However, the power of n will grow linearly as we allow more transactions,
// all the way until we reach a time complexity of n^n.
// THEREFORE, I try to reduce it in O(n) time, 
// with the rising cost of time and efforts in codding and debugging.

// Runtime: 1 ms, faster than 99.47% of Java online submissions for Best Time to Buy and Sell Stock III.
// Memory Usage: 37.3 MB, less than 100.00% of Java online submissions for Best Time to Buy and Sell Stock III.

class Solution {
    public int maxProfit(int[] prices) {
        // first to find best profit under one transaction
        // we then call this the best transaction
        int left_index = 0;
        int temp_index = 0;
        int right_index = 0;
        int max_profit = 0;
        int i;
        for (i = 0; i < prices.length-1; i++){
            if (prices[i+1] < prices[temp_index])
                temp_index = i+1;
            else if (prices[i+1] - prices[temp_index] > max_profit){
                max_profit = prices[i+1] - prices[temp_index];
                right_index = i+1;
                left_index = temp_index;
            }
        }
        // System.out.println(left_index);
        // System.out.println(right_index);
        // System.out.println(max_profit);
        if (right_index == 0)
            return 0;
        
        // CASE ONE: the best transaction is included to maximize profits
        //           left_index and right_index mark the beginning and end of the best transaction
        int left[]  = new int[left_index];
        int right[] = new int[prices.length - right_index -1];
        int case_one_best = 0;
        for (i = 0; i < left_index; i++)
            left[i] = prices[i];
        for (i = right_index+1; i < prices.length; i++)
            right[i - right_index - 1] = prices[i];
        int best_left = maxProfitAtomic(left);
        int best_right = maxProfitAtomic(right);
        if (best_left > best_right)
            case_one_best = max_profit + best_left;
        else 
            case_one_best = max_profit + best_right;
        // System.out.println(case_one_best);
        
        // CASE TWO: the best transaction is NOT included to maximize profits
        //           we have to split the best transaction
        int max_price = prices[left_index];
        int min_profit = 0;
        for (i = left_index; i < right_index; i++) {
            if (prices[i+1] > prices[i])
                max_price = prices[i+1];
            else if (prices[i+1] - max_price < min_profit)
                min_profit = prices[i+1] - max_price;
        }
        int case_two_best = max_profit - min_profit;
        // System.out.println(case_two_best);
        
        // FINALLY
        if (case_one_best > case_two_best)
            return case_one_best;
        else
            return case_two_best;
    }
    
    public int maxProfitAtomic(int[] prices) {
        if (prices.length == 0)
            return 0;
        int min_price = prices[0];
        int max_profit = 0;
        int i;
        for (i = 0; i < prices.length-1; i++){
            if (prices[i+1] < min_price)
                min_price = prices[i+1];
            else if (prices[i+1] - min_price > max_profit)
                max_profit = prices[i+1] - min_price;
        }
        return max_profit;
    }
}