// Runtime: 11 ms, faster than 21.95% of Java online submissions for Permutations II.
// Memory Usage: 45.7 MB, less than 5.97% of Java online submissions for Permutations II.
// Runtime: 3 ms, faster than 36.82% of Java online submissions for Permutations II.
// Memory Usage: 40.2 MB, less than 41.79% of Java online submissions for Permutations II.

class Solution {

	List<List<Integer>> res_l;
	ConcurrentHashMap<Integer, Integer> n_to_count;
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        final int n = nums.length;
        res_l = new LinkedList<>();
        if(n == 0) return res_l;

        
        n_to_count = new ConcurrentHashMap<>();
        for (int i : nums)
        	n_to_count.put(i, 1+n_to_count.getOrDefault(i, 0));
        dfs(0, n, new ArrayList<>());
        return res_l;
    }

    private void dfs(int num_visited, int n, ArrayList<Integer> temp) {
    	// quit condition
    	if (num_visited == n) {
    		res_l.add(new LinkedList(temp));
    		return;
    	}

    	// node selection
    	for (Integer i : n_to_count.keySet()) {
    		temp.add(i);
    		n_to_count.put(i, n_to_count.get(i)-1);
    		if (n_to_count.get(i) == 0) n_to_count.remove(i);
    		dfs(num_visited+1, n, temp);
    		temp.remove(temp.size()-1);
    		n_to_count.put(i, 1+n_to_count.getOrDefault(i, 0));
    	}
    }
    
}

// // Runtime: 1428 ms, faster than 5.04% of Java online submissions for Permutations II.
// // Memory Usage: 40.9 MB, less than 19.40% of Java online submissions for Permutations II.
// // Time Limit Exceeded
// // Runtime: 2620 ms, faster than 5.04% of Java online submissions for Permutations II.
// // Memory Usage: 254.3 MB, less than 5.97% of Java online submissions for Permutations II.

// class Solution {

// 	List<List<Integer>> res_l;
    
//     public List<List<Integer>> permuteUnique(int[] nums) {
//         final int n = nums.length;
//         res_l = new LinkedList<>();
//         if(n == 0) return res_l;

//         Arrays.sort(nums);
//         boolean[] visited = new boolean[n];
//         Arrays.fill(visited, false);
//         dfs(nums, visited, 0, n, new ArrayList<>());
//         return res_l;
//     }

//     private void dfs(int[] nums, boolean[] visited, int num_visited, int n, List<Integer> temp) {
//     	// quit condition
//     	if (num_visited == n) {
//     		res_l.add(new LinkedList(temp));
//     		return;
//     	}

//     	// node selection
//     	for (int i = 0; i < n; i++) {
//     		if (visited[i]) continue;
//     		temp.add(nums[i]);
//     		visited[i] = true;
//     		dfs(nums, visited, num_visited+1, n, temp);
//     		temp.remove(temp.size()-1);
//     		visited[i] = false;
//     	}
//     }

// }