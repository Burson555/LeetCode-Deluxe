// Runtime: 4 ms, faster than 98.21% of Java online submissions for Contains Duplicate II.
// Memory Usage: 44.8 MB, less than 10.53% of Java online submissions for Contains Duplicate II.
// Runtime: 4 ms, faster than 98.21% of Java online submissions for Contains Duplicate II.
// Memory Usage: 45.1 MB, less than 10.53% of Java online submissions for Contains Duplicate II.

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i-k-1 >= 0) hs.remove(nums[i-k-1]);
            if (!hs.add(nums[i])) return true;
        }
        return false;
    }
}


// // Runtime: 5 ms, faster than 96.18% of Java online submissions for Contains Duplicate II.
// // Memory Usage: 44.8 MB, less than 15.79% of Java online submissions for Contains Duplicate II.
// // Runtime: 5 ms, faster than 96.18% of Java online submissions for Contains Duplicate II.
// // Memory Usage: 44.7 MB, less than 15.79% of Java online submissions for Contains Duplicate II.

// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         int length = nums.length;
//         for (int i = 0; i < length; i++) {
//             int curr = nums[i];
//             if (hm.containsKey(curr) && i - hm.get(curr) <= k)
//                 return true;
//             else hm.put(curr, i);
//         }
//         return false;
//     }
// }