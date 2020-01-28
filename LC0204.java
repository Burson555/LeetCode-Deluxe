// Runtime: 14 ms, faster than 48.61% of Java online submissions for Count Primes.
// Memory Usage: 39.3 MB, less than 5.66% of Java online submissions for Count Primes.

class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean result[] = new boolean[n];
        for (int i = 0; i < n; i++)
            result[i] = true;
        for (int i = 2; i < 1+(int)Math.sqrt(n); i++) {
            if (result[i] == false) continue;
            int base = i;
            while (n - base > i) {
                base += i;
                result[base] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++)
            if (result[i] == true)
                count++;
        return count;
    }
}