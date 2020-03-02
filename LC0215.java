// Runtime: 1 ms, faster than 98.29% of Java online submissions for Kth Largest Element in an Array.
// Memory Usage: 40.8 MB, less than 5.18% of Java online submissions for Kth Largest Element in an Array.
// Runtime: 1 ms, faster than 98.29% of Java online submissions for Kth Largest Element in an Array.
// Memory Usage: 40.9 MB, less than 5.18% of Java online submissions for Kth Largest Element in an Array.

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


// // Runtime: 3 ms, faster than 75.69% of Java online submissions for Kth Largest Element in an Array.
// // Memory Usage: 40.7 MB, less than 5.18% of Java online submissions for Kth Largest Element in an Array.
// // Runtime: 3 ms, faster than 75.69% of Java online submissions for Kth Largest Element in an Array.
// // Memory Usage: 40.7 MB, less than 5.18% of Java online submissions for Kth Largest Element in an Array.

// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
//         for (int i = 0; i < nums.length; i++) {
//             if (pq.size() < k) {
//                 pq.offer(nums[i]);
//             } else if (pq.peek() < nums[i]) {
//                 pq.poll();
//                 pq.offer(nums[i]);
//             }
//         }
//         return pq.peek();
//     }
// }