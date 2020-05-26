// Runtime: 19 ms, faster than 57.40% of Java online submissions for Combinations.
// Memory Usage: 42.4 MB, less than 6.52% of Java online submissions for Combinations.
// Runtime: 19 ms, faster than 57.40% of Java online submissions for Combinations.
// Memory Usage: 42.7 MB, less than 6.52% of Java online submissions for Combinations.

class Solution {
    
    List<List<Integer>> res_l;
        
    public List<List<Integer>> combine(int n, int k) {
        res_l = new LinkedList<>();
        if (n < 1 || k > n) return res_l;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i+1;
        dfs(arr, 0, n, k, new ArrayList<Integer>());
        return res_l;
    }

    private void dfs(int[] arr, int curr, int n, int stage, List<Integer> temp) {
    	// quit condition: HIT
    	if (stage == 0) {
    		res_l.add(new LinkedList<Integer>(temp));
    		return;
    	}

    	// quit condition: MISS
    	if (stage != 0 && curr == n) return;

    	// node selection
    	for (int i = curr; i < n; i++) {
    		temp.add(arr[i]);
    		dfs(arr, i+1, n, stage-1, temp);
    		temp.remove(temp.size()-1);
    	}
    }

}


//  the following solution is for PERMUTATION

// class Solution {
    
//     List<List<Integer>> res_l;
        
//     public List<List<Integer>> combine(int n, int k) {
//         res_l = new LinkedList<>();
//         if (n < 1 || k > n) return res_l;
//         int arr[n] = new int[n];
//         boolean bm[] = new boolean[n];
//         for (int i = 0; i < n; i++) {
//         	arr[i] = i+1;
//         	boolean[i] = false;
//         }
//         dfs(arr, bm, n, k, new ArrayList<Integer>());
//         return res_l;
//     }

//     private void dfs(int[] arr, boolean[] bm, int n, int stage, List<Integer> temp) {
//     	// quit condition
//     	if (stage == 0) {
//     		res_l.add(new LinkedList<Integer>(temp));
//     		return;
//     	}

//     	// node selection
//     	for (int i = 0; i < n; i++) {
//     		if (bm[i]) continue;
//     		temp.add(arr[i]);
//     		bm[i] = true;
//     		dfs(arr, bm, n, stage-1, temp);
//     		temp.remove(temp.size()-1);
//     		bm[i] = false;
//     	}
//     }

// }