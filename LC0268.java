// Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
// Memory Usage: 42.5 MB, less than 5.26% of Java online submissions for Missing Number.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
// Memory Usage: 42.7 MB, less than 5.26% of Java online submissions for Missing Number.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
// Memory Usage: 42.4 MB, less than 5.26% of Java online submissions for Missing Number.

class Solution {
    public int missingNumber(int[] nums) {
        int acc = 0;
        for (int i = 0; i < nums.length; i++)
            acc ^= (i ^ nums[i]);
        acc ^= nums.length;
        return acc;
    }
}


// Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
// Memory Usage: 42.8 MB, less than 5.26% of Java online submissions for Missing Number.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
// Memory Usage: 42.8 MB, less than 5.26% of Java online submissions for Missing Number.
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
// Memory Usage: 42.5 MB, less than 5.26% of Java online submissions for Missing Number.

class Solution {
    public int missingNumber(int[] nums) {
        int total = nums.length*(nums.length+1)/2;
        for (int i = 0; i < nums.length; i++)
            total -= nums[i];
        return total;
    }
}