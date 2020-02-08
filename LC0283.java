// Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
// Memory Usage: 42.4 MB, less than 5.59% of Java online submissions for Move Zeroes.

class Solution {
    public void moveZeroes(int[] nums) {
        int lp = 0, length = nums.length;
        for (int rp = 0; rp < length; rp++)
            if (nums[rp] != 0)
                this.swap(nums, lp++, rp);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


// // Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
// // Memory Usage: 42.6 MB, less than 5.59% of Java online submissions for Move Zeroes.

// class Solution {
//     public void moveZeroes(int[] nums) {
//         int lp = 0, length = nums.length;
//         for (int rp = 0; rp < length; rp++)
//             if (nums[rp] != 0)
//                 nums[lp++] = nums[rp];
//         for (; lp < length; lp++)
//             nums[lp] = 0;
//     }
// }