// Runtime: 11 ms, faster than 93.63% of Java online submissions for Subarray Sum Equals K.
// Memory Usage: 40.5 MB, less than 30.43% of Java online submissions for Subarray Sum Equals K.

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, n = nums.length, sum = 0;
        HashMap<Integer, Integer> sum_to_count = new HashMap<>();
        sum_to_count.put(sum, 1);
        for (int i : nums) {
            sum += i;
            int temp = sum-k;
            if (sum_to_count.containsKey(temp))
                count += sum_to_count.get(temp);
            sum_to_count.put(sum, 1+sum_to_count.getOrDefault(sum, 0));
        }
        return count;
    }
}

// // Runtime: 206 ms, faster than 24.26% of Java online submissions for Subarray Sum Equals K.
// // Memory Usage: 39.8 MB, less than 77.17% of Java online submissions for Subarray Sum Equals K.

// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count = 0, n = nums.length;
//         for (int start = 0; start < n; start++) {
//             int sum = 0;
//             for (int i = start; i < n; i++) {
//                 sum += nums[i];
//                 if (sum == k) count++;
//             }
//         }
//         return count;
//     }
// }