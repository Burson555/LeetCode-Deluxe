// Runtime: 1 ms, faster than 100.00% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
// Memory Usage: 41.3 MB, less than 100.00% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.

// The elements in tha array allocated by new will automatically be initialized to
//                      ZERO    for numeric types
//                      FALSE   for boolean types
//                      NULL    for reference types
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) count[nums[i]]++;
        for (int i = 1 ; i <= 100; i++) count[i] += count[i-1];    
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 0) res[i] = 0;
            else res[i] = count[nums[i] - 1];
        return res;        
    }
}


// // Runtime: 3 ms, faster than 100.00% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
// // Memory Usage: 41.7 MB, less than 100.00% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.

// class Solution {
//     public int[] smallerNumbersThanCurrent(int[] nums) {
//         double[] temp = new double[nums.length];
//         int[] res = new int[nums.length];
//         for (int i = 0; i < nums.length; i++)
//             temp[i] = (double)nums[i];
//         Arrays.sort(temp);
//         for (int i = 0; i < nums.length; i++)
//             res[i] = -1-Arrays.binarySearch(temp, (double)(nums[i]-0.1));
//         return res;
//     }
// }