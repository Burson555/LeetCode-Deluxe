// Since this is a randomized algorithm where the time and space required for each run is different, 
//      we will run it several times.

// Runtime: 1 ms, faster than 99.84% of Java online submissions for Majority Element.
// Memory Usage: 41.4 MB, less than 78.68% of Java online submissions for Majority Element.

// Runtime: 2 ms, faster than 65.61% of Java online submissions for Majority Element.
// Memory Usage: 50.3 MB, less than 5.15% of Java online submissions for Majority Element.

// Runtime: 3 ms, faster than 55.80% of Java online submissions for Majority Element.
// Memory Usage: 51 MB, less than 5.15% of Java online submissions for Majority Element.

// Runtime: 2 ms, faster than 65.61% of Java online submissions for Majority Element.
// Memory Usage: 50.9 MB, less than 5.15% of Java online submissions for Majority Element.

// Runtime: 3 ms, faster than 55.80% of Java online submissions for Majority Element.
// Memory Usage: 50.7 MB, less than 5.15% of Java online submissions for Majority Element.

// Runtime: 3 ms, faster than 55.80% of Java online submissions for Majority Element.
// Memory Usage: 51.1 MB, less than 5.15% of Java online submissions for Majority Element.

// Runtime: 2 ms, faster than 65.61% of Java online submissions for Majority Element.
// Memory Usage: 51 MB, less than 5.15% of Java online submissions for Majority Element.

// Runtime: 1 ms, faster than 99.84% of Java online submissions for Majority Element.
// Memory Usage: 41.7 MB, less than 68.38% of Java online submissions for Majority Element.

import java.util.Random;

class Solution {
    public int majorityElement(int[] nums) {
        Random r = new Random();
        while (true) {
            int temp = nums[r.nextInt(nums.length)];
            int count = 0;
            for (int i : nums)
                if (i == temp)
                    count++;
            if (count > nums.length/2)
                return temp;
        }
    }
}

// // Runtime: 2 ms, faster than 65.61% of Java online submissions for Majority Element.
// // Memory Usage: 45.4 MB, less than 5.15% of Java online submissions for Majority Element.

// class Solution {
//     public int majorityElement(int[] nums) {
//         int count = 0;
//         Integer candidate = null;

//         for (int num : nums) {
//             if (count == 0) {
//                 candidate = num;
//             }
//             count += (num == candidate) ? 1 : -1;
//         }

//         return candidate;
//     }
// }

// // Runtime: 9 ms, faster than 49.95% of Java online submissions for Majority Element.
// // Memory Usage: 46.7 MB, less than 5.15% of Java online submissions for Majority Element.

// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
//         for (int i : nums) {
//             if (table.containsKey(i))
//                 table.put(i, table.get(i)+1);
//             else
//                 table.put(i, 1);
//         }
//         for (Integer i : table.keySet())
//             if (table.get(i) > nums.length/2)
//                 return i.intValue();
//         return 0;
//     }
// }