// THE FOLLOWING ALGORITHM WON'T WORK BECAUSE
// it's we can't exclude duplicate combinations
// it is important for us to differentiate COMBINATION and PERMUTATION!!!

// class Solution {

// 	List<List<Integer>> res_l;
// 	Map<Integer, Integer> num_to_count;

//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         final int n = candidates.length;
//         res_l = new LinkedList<>();
//         if(n == 0) return res_l;

//         num_to_count = new ConcurrentHashMap<>();
//         for (int i : candidates)
//         	num_to_count.put(i, 1+num_to_count.getOrDefault(i, 0));

//         dfs(candidates, target, new ArrayList<>());
//         return res_l;
//     }

//     private void dfs(int[] candidates, int target, List<Integer> temp) {
//     	// quit condition I
//     	if (target == 0) {
//     		res_l.add(new LinkedList<>(temp));
//     		return;
//     	}

//     	// quit condition II
//     	if (target < 0 || num_to_count.keySet().isEmpty()) return;

//     	// node selection
//     	for (int i : num_to_count.keySet()) {
//     		temp.add(i);
//     		num_to_count.put(i, num_to_count.get(i)-1);
//     		if (num_to_count.get(i) == 0) num_to_count.remove(i);
//     		dfs(candidates, target-i, temp);
//     		num_to_count.put(i, 1+num_to_count.getOrDefault(i, 0));
//     		temp.remove(temp.size()-1);
//     	}
//     }

// }



// Runtime: 7 ms, faster than 24.45% of Java online submissions for Combination Sum II.
// Memory Usage: 40.4 MB, less than 27.37% of Java online submissions for Combination Sum II.

class Solution {

	List<List<Integer>> res_l;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        final int n = candidates.length;
        res_l = new LinkedList<>();
        if(n == 0) return res_l;

        Arrays.sort(candidates);
        dfs(candidates, n, 0, target, new ArrayList<>());
        return res_l;
    }

    private void dfs(int[] candidates, int n, final int start, int target, List<Integer> temp) {
    	// quit condition I
    	if (target == 0) {
    		res_l.add(new LinkedList<>(temp));
    		return;
    	}

    	// quit condition II
    	if (target < 0 || start == n) return;

    	// node selection
    	for (int i = start; i < n; i++) {
    		if (i > start && candidates[i] == candidates[i-1]) continue;
    		temp.add(candidates[i]);
    		dfs(candidates, n, i+1, target-candidates[i], temp);
    		temp.remove(temp.size()-1);
    	}
    }

}