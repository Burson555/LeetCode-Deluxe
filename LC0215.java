// Runtime: 406 ms, faster than 5.20% of Java online submissions for Kth Largest Element in an Array.
// Memory Usage: 41.4 MB, less than 5.18% of Java online submissions for Kth Largest Element in an Array.

import java.util.Random;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        return this.mySelect(nums, 0, nums.length-1, k-1);
    }
    
    private int mySelect(int[] nums, int low, int high, int k) {
        if (low == high) return nums[k];
        Random r = new Random();
        int t = r.nextInt(high - low + 1) + low;
        this.swap(nums, t, high);
        int pos = low;
        for (int i = low; i < high; i++)
            if (nums[i] > nums[high])
                this.swap(nums, i, pos++);
        this.swap(nums, high, pos);
        System.out.print(pos + ": ");
        for (int j : nums)
            System.out.print(j + " ");
        System.out.println();
        if (pos < k) 
            return this.mySelect(nums, pos+1, high, k);
        if (pos > k) 
            return this.mySelect(nums, low, pos-1, k);
        return nums[pos];
    }
    
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}