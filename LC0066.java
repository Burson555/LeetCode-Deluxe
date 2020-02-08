// Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
// Memory Usage: 38.3 MB, less than 5.64% of Java online submissions for Plus One.

class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        if (digits[length-1] != 9) {
            digits[length-1]++;
            return digits;
        } else {
            int count_nine = 0;
            for (int i = length-1; i >= 0; i--){
                if (digits[i] == 9){
                    count_nine++;
                } else {
                    break;
                }
            }
            if (count_nine != length) {
                digits[length-count_nine-1]++;
                for (int i = length-count_nine; i < length; i++)
                    digits[i] = 0;
                return digits;
            } else {
                int new_digits[] = new int[length+1];
                new_digits[0] = 1;
                return new_digits;
            }
        }
    }
}