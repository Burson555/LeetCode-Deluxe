// Runtime: 1 ms, faster than 99.91% of Java online submissions for Two Sum.
// Memory Usage: 42.1 MB, less than 5.65% of Java online submissions for Two Sum.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i]))
                return new int[] {hm.get(target - nums[i]), i};
            hm.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         int res[] = new int[2];
//         Arrays.fill(res, -1);
//         for (int i = 0; i < nums.length; i++) {
//             if (hm.containsKey(target - nums[i])) {
//                 res[0] = hm.get(target - nums[i]);
//                 res[1] = i;
//                 break;
//             } else {
//                 hm.put(nums[i], i);
//             }
//         }
//         return res;
//     }
// }


// WHY WE BETTER NOT USE SORTING IN THIS CASE?
// IN WHAT CIRCUMSTANCES CAN WE UTILIZE SORTING?