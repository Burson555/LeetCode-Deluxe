// Runtime: 5 ms, faster than 83.83% of Java online submissions for Subarray Sums Divisible by K.
// Memory Usage: 40.2 MB, less than 94.74% of Java online submissions for Subarray Sums Divisible by K.

class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int n = A.length;
        int dp[] = new int[n+1];
        for (int i = 0; i < n; i++) dp[i+1] = dp[i] + A[i];
        
        int counter[] = new int[K];
        for (int i : dp) counter[(i%K+K)%K] += 1;
        
        int res = 0;
        for (int i : counter) res += i*(i-1)/2;
        return res;
    }
}