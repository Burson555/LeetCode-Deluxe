// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
// Memory Usage: 38.5 MB, less than 5.05% of Java online submissions for Remove Element.

class Solution {
    public int removeElement(int[] nums, int val) {
        int lp = 0;
        for (int rp = 0; rp < nums.length; rp++)
            if (nums[rp] != val)
                nums[lp++] = nums[rp];
        return lp;
    }
}