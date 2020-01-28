// Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.
// Memory Usage: 37.2 MB, less than 6.02% of Java online submissions for Pascal's Triangle.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rl = new LinkedList<List<Integer>>();
        if (numRows <= 0) return rl;
        for (int j = 0; j < numRows; j++) {
            List<Integer> tl = new LinkedList<Integer>();
            for (int i = 0; i < j+1; i++) {
                if (i == 0 || i == j) {
                    tl.add(1);
                } else {
                    tl.add(rl.get(j-1).get(i-1) + rl.get(j-1).get(i));
                }
            }
            rl.add(tl);
        }
        return rl;
    }
}