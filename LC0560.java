// Runtime: 11 ms, faster than 93.63% of Java online submissions for Subarray Sum Equals K.
// Memory Usage: 40.5 MB, less than 30.43% of Java online submissions for Subarray Sum Equals K.

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0, res = 0;
        hm.put(0, 1);
        for (int i : nums) {
            sum += i;
            if (hm.containsKey(sum-k)) res += hm.get(sum-k);
            hm.put(sum, 1+hm.getOrDefault(sum, 0));
        }
        return res;
    }
}

// // Runtime: 206 ms, faster than 24.26% of Java online submissions for Subarray Sum Equals K.
// // Memory Usage: 39.8 MB, less than 77.17% of Java online submissions for Subarray Sum Equals K.

// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n = nums.length;
//         int res = 0;
//         for (int i = 0; i < n; i++) {
//             int temp_sum = 0;
//             for (int j = i; j < n; j++) {
//                 temp_sum += nums[j];
//                 if (temp_sum == k) res += 1;
//             }
//         }
//         return res;
//     }
// }