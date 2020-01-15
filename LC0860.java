// Very simple question.
// This is the best answer I can give.

// Runtime: 2 ms, faster than 86.25% of Java online submissions for Lemonade Change.
// Memory Usage: 40.4 MB, less than 84.62% of Java online submissions for Lemonade Change.

class Solution {
    public boolean lemonadeChange(int[] bills) {
        if (bills == null)
            return false;
        int five = 0;
        int ten = 0;
        for (int bill: bills) {
            if (bill == 5){
                five++;
                continue;
            }
            five--;
            if (bill == 10) 
                ten++;
            if (bill == 20) {
                if (ten > 0)
                    ten--;
                else
                    five = five - 2;
            }
            if (five < 0 || ten < 0)
                return false;
        }
        return true;
    }
}