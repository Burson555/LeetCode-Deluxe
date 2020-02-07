// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array.
// Memory Usage: 40.9 MB, less than 42.55% of Java online submissions for Remove Duplicates from Sorted Array.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array.
// Memory Usage: 40.9 MB, less than 44.68% of Java online submissions for Remove Duplicates from Sorted Array.

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int lp = 1, rp = 1, prev = nums[0];
        while (rp < nums.length) {
            if (nums[rp] != prev) {
                nums[lp++] = nums[rp];
                prev = nums[rp++];
            } else {
                rp++;
            }
        }
        return lp;
    }
}