// Runtime: 5 ms, faster than 39.07% of Java online submissions for Combination Sum.
// Memory Usage: 39.8 MB, less than 13.34% of Java online submissions for Combination Sum.

class Solution {
    
    List<List<Integer>> res_l;
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        res_l = new LinkedList<>();
        if (n == 0) return res_l;

        Arrays.sort(candidates);
        List<Integer> temp = new ArrayList<>();

        dfs(candidates, n, 0, temp, target);

        return res_l;
    }
    
    private void dfs(int[] candidates, int n, int curr, List<Integer> temp, int target) {
    	// quit condition I
    	if (target == 0) {
    		res_l.add(new ArrayList(temp));
    		return;
    	}

    	// quit condition II
    	if (target < 0) return;

    	// node selection
    	for (int i = curr; i < n; i++) {
    		temp.add(candidates[i]);
    		dfs(candidates, n, i, temp, target-candidates[i]);
    		temp.remove(temp.size()-1);
    	}
    }
}