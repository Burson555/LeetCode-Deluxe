// Runtime: 75 ms, faster than 73.49% of Java online submissions for Shuffle an Array.
// Memory Usage: 51.5 MB, less than 100.00% of Java online submissions for Shuffle an Array.
// Runtime: 74 ms, faster than 76.83% of Java online submissions for Shuffle an Array.
// Memory Usage: 51.2 MB, less than 100.00% of Java online submissions for Shuffle an Array.
// Runtime: 76 ms, faster than 69.98% of Java online submissions for Shuffle an Array.
// Memory Usage: 51.5 MB, less than 100.00% of Java online submissions for Shuffle an Array.
// Runtime: 77 ms, faster than 66.84% of Java online submissions for Shuffle an Array.
// Memory Usage: 51.1 MB, less than 100.00% of Java online submissions for Shuffle an Array.

import java.util.Random;

class Solution {
    
    int[] arr;
    int[] ori;
    
    public Solution(int[] nums) {
        this.arr = new int[nums.length];
        this.ori = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            this.arr[i] = nums[i];
            this.ori[i] = nums[i];
        }
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = this.ori[i];
        }
        return this.arr;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random r = new Random();
        int len = this.arr.length;
        for (int i = 0; i < len; i++) {
            int j = r.nextInt(len);
            int temp = this.arr[j];
            this.arr[j] = this.arr[i];
            this.arr[i] = temp;
        }
        return this.arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */