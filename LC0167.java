// Runtime: 1 ms, faster than 54.94% of Java online submissions for Two Sum II - Input array is sorted.
// Memory Usage: 42.7 MB, less than 5.22% of Java online submissions for Two Sum II - Input array is sorted.
// Runtime: 1 ms, faster than 54.94% of Java online submissions for Two Sum II - Input array is sorted.
// Memory Usage: 43.2 MB, less than 5.22% of Java online submissions for Two Sum II - Input array is sorted.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0, rp = numbers.length-1;
        while (lp < rp) {
            if (numbers[lp] + numbers[rp] == target)
                return new int[] {++lp, ++rp};
            else if (numbers[lp] + numbers[rp] > target)
                rp--;
            else lp++;
        }
        return null;
    }
}