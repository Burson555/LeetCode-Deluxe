// Runtime: 6 ms, faster than 80.89% of Java online submissions for Contains Duplicate.
// Memory Usage: 45.7 MB, less than 5.17% of Java online submissions for Contains Duplicate.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            if (hs.contains(i))
                return true;
            hs.add(i);
        }
        return false;
    }
}


// // Runtime: 8 ms, faster than 62.37% of Java online submissions for Contains Duplicate.
// // Memory Usage: 44.8 MB, less than 35.34% of Java online submissions for Contains Duplicate.
// // Runtime: 7 ms, faster than 65.41% of Java online submissions for Contains Duplicate.
// // Memory Usage: 44.7 MB, less than 42.24% of Java online submissions for Contains Duplicate.

// import java.util.Random;

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         int length  = nums.length;
//         this.mySort(nums, 0, length-1);
//         for (int i = 0; i < length-1; i++)
//             if (nums[i] == nums[i+1])
//                 return true;
//         return false;
//     }
    
//     private void mySort(int[] nums, int low, int high) {
//         if (low >= high) return;
//         Random r = new Random();
//         int k = r.nextInt(high-low+1) + low;
//         this.swap(nums, k, high);
//         k = low;
//         for (int i = low; i < high; i++)
//             if (nums[i] <= nums[high])
//                 this.swap(nums, i, k++);
//         this.swap(nums, k,  high);
//         this.mySort(nums, low, k-1);
//         this.mySort(nums, k+1, high);
//     }
    
//     private void swap(int[] nums, int a, int b) {
//         int temp = nums[a];
//         nums[a] = nums[b];
//         nums[b] = temp;
//     }
// }