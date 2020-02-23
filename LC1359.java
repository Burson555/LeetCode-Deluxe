// Runtime: 2 ms, faster than 100.00% of Java online submissions for Count All Valid Pickup and Delivery Options.
// Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Count All Valid Pickup and Delivery Options.

class Solution {
    
    final int b = 1000000000+7;
    
    public int countOrders(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            int t1 = 2*i-1;
            int t2 = t1*(t1-1)/2;
            res = mul(res, t1+t2);
        }
        return res;
    }
    
    private int mul(int res, int t) {
        if (Integer.MAX_VALUE/t <= res) {
            int temp = mul(res, t/2);
            temp = (2*temp) % b;
            if (t % 2 == 1) temp = (res + temp) % b;
            return temp;
        } else {
            return (t*res) % b;
        }
    }
}