// Runtime: 3 ms, faster than 92.51% of Java online submissions for Add to Array-Form of Integer.
// Memory Usage: 41.7 MB, less than 90.48% of Java online submissions for Add to Array-Form of Integer.

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int n = A.length-1, carryout = 0;
        for (; n >= 0; n--) {
            A[n] += K%10 + carryout;
            carryout = A[n]/10;
            A[n] = A[n]%10;
            K = K/10;
        }
        List<Integer> res = new LinkedList<>();
        if (carryout == 1) K += 1;
        if (K != 0) {
            while (K != 0) {
                res.add(K%10);
                K /= 10;
            }
            Collections.reverse(res);
        }
        for (int i : A) res.add(i);
        return res;
    }
}