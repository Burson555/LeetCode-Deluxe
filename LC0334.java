// Runtime: 0 ms, faster than 100.00% of Java online submissions for Increasing Triplet Subsequence.
// Memory Usage: 39.6 MB, less than 76.74% of Java online submissions for Increasing Triplet Subsequence.

class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        int small, middle;
        small = nums[0];
        middle = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i <= small) small = i;
            else {
                if (middle == Integer.MIN_VALUE) middle = i;
                else if (i <= middle) middle = i;
                else return true;
            }
        }
        return false;
    }
}

// // Runtime: 0 ms, faster than 100.00% of Java online submissions for Increasing Triplet Subsequence.
// // Memory Usage: 39.2 MB, less than 95.35% of Java online submissions for Increasing Triplet Subsequence.

// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         if (nums == null || nums.length < 3) return false;
//         int n = nums.length;
//         int v1 = nums[0], v2 = Integer.MAX_VALUE, v3 = Integer.MAX_VALUE;
//         for (int i = 1; i < n; i++) {
//             if (nums[i] < v1) v1 = nums[i];
//             else if (nums[i] > v1 && nums[i] < v2) v2 = nums[i];
//             else if (nums[i] > v2 && nums[i] <= v3) return true;
//         }
//         return false;
//     }
// }