// WHY THIS PROBLEM WE CAN USE THE GREEDY METHOD?

// Runtime: 6 ms, faster than 95.46% of Java online submissions for Closest Divisors.
// Memory Usage: 37.4 MB, less than 100.00% of Java online submissions for Closest Divisors.

class Solution {
    public int[] closestDivisors(int num) {
        int upper = (int)Math.sqrt(num+2);
        for (int i = upper; i >= 1; i--) {
            if ((num+1) % i == 0) return new int[]{i, (num+1)/i};
            if ((num+2) % i == 0) return new int[]{i, (num+2)/i};
        }
        return new int[]{};
    }
}