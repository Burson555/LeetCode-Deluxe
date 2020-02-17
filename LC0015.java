// Runtime: 16 ms, faster than 99.54% of Java online submissions for 3Sum.
// Memory Usage: 45.8 MB, less than 95.05% of Java online submissions for 3Sum.
// Runtime: 17 ms, faster than 98.65% of Java online submissions for 3Sum.
// Memory Usage: 45.8 MB, less than 95.05% of Java online submissions for 3Sum.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rl = new LinkedList<>();
        Arrays.sort(nums);
        int length = nums.length, prev;
        prev = 1; // any positive value can do
        for (int i = 0; i < length-2 && nums[i] <= 0; i++) {
            if (nums[i] == prev) continue;
            int target = -nums[i], lp = i+1, rp = length-1;
            while (lp < rp) {
                if (nums[lp] + nums[rp] < target) lp++;
                else if (nums[lp] + nums[rp] > target) rp--;
                else {
                    List<Integer> tl = new ArrayList<>();
                    tl.add(nums[i]);
                    tl.add(nums[lp]);
                    tl.add(nums[rp]);
                    rl.add(tl);
                    while (lp+1 < rp && nums[lp+1] == nums[lp])
                        lp++;
                    lp++;
                }
            }
            prev = nums[i];
        }
        return rl;
    }
}