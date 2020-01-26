// Runtime: 7 ms, faster than 31.33% of Java online submissions for Majority Element II.
// Memory Usage: 46.5 MB, less than 7.27% of Java online submissions for Majority Element II.

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        if (nums.length < 2){
            for (int i = 0; i < nums.length; i++)
                result.add(nums[i]);
            return result;
        }
        Integer candidate_1 = nums[0];
        int count_1 = 0;
        Integer candidate_2 = nums[1];
        int count_2 = 0;
        for (int i : nums) {
            if (i == candidate_1.intValue()) count_1++;
            else if (i == candidate_2.intValue()) count_2++;
            else if (count_1 == 0) {
                count_1 = 1;
                candidate_1 = i;
            } else if (count_2 == 0) {
                count_2 = 1;
                candidate_2 = i;
            } else {
                count_1--;
                count_2--;
            }
        }
        count_1 = 0;
        count_2 = 0;
        for (int i : nums) {
            if (i == candidate_1) count_1++;
            if (i == candidate_2) count_2++;
        }
        if (count_1 > nums.length/3)
            result.add(candidate_1);
        if (count_2 > nums.length/3 && candidate_1 != candidate_2)
            result.add(candidate_2);
        return result;
    }
}