


// Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
// Memory Usage: 37.9 MB, less than 5.51% of Java online submissions for Sort Colors.

// TWO PASS SOLUTION
class Solution {
    public void sortColors(int[] nums) {
        int lp = 0, rp = nums.length-1;
        int nxt0 = lp;
        int nxt2 = rp;
        while (lp < nums.length) {
            if (nums[lp] == 0) this.swap(nums, lp, nxt0++);
            lp++;
        }
        while (rp >= nxt0) {
            if (nums[rp] == 2) this.swap(nums, rp, nxt2--);
            rp--;
        }
    }
    
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}