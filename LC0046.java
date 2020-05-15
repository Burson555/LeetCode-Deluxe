// Runtime: 3 ms, faster than 21.11% of Java online submissions for Permutations.
// Memory Usage: 40 MB, less than 5.68% of Java online submissions for Permutations.

// this implementation is slower maybe becuase of the operation of HashSet
class Solution {
    
    List<List<Integer>> res_l;
    HashSet<Integer> visited;
    
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length, level = 0;
        res_l = new LinkedList<>();
        if (n == 0) return res_l;
        
        visited = new HashSet<>();
        List<Integer> temp = new ArrayList<>();

        dfs(nums, temp);

        return res_l;
    }
    
    private void dfs(int[] nums, List<Integer> temp) {
        if (temp.size() == nums.length) { // quit condition
            res_l.add(new LinkedList(temp));
        } else { // node selection
            for (int i : nums) {
                if (!visited.add(i)) continue;
                temp.add(i);
                dfs(nums, temp);
                temp.remove(temp.size()-1);
                visited.remove(i);
            }
        }
    }
}



// Runtime: 1 ms, faster than 90.47% of Java online submissions for Permutations.
// Memory Usage: 39.7 MB, less than 5.68% of Java online submissions for Permutations.

class Solution {
    
    List<List<Integer>> res_l;
    
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length, level = 0;
        res_l = new LinkedList<>();

        if (n == 0) return res_l;
        
        boolean bm[] = new boolean[n];
        Arrays.fill(bm, false);
        List<Integer> temp = new ArrayList<>();

        dfs(nums, bm, temp, level);

        return res_l;
    }
    
    private void dfs(int[] nums, boolean[] bm, List<Integer> temp, int level) {
        if (level == nums.length) { // quit condition
            res_l.add(new LinkedList(temp));
        } else { // node selection
            for (int i = 0; i < n; i++) {
                if (bm[i]) continue;
                temp.add(nums[i]);
                bm[i] = true;
                dfs(nums, bm, temp, level+1, n);
                temp.remove(temp.size()-1);
                bm[i] = false;
            }
        }
    }
}