// Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
// Memory Usage: 38.2 MB, less than 5.64% of Java online submissions for Plus One.

class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1] != 9) {
            digits[digits.length-1]++;
            return digits;
        }
        int i;
        for (i = digits.length-1; i >= 0; i--){
            if (digits[i] == 9) digits[i] = 0;
            else break;
        }
        if (i != -1) {
            digits[i]++;
            return digits;
        }
        int new_digits[] = new int[digits.length+1];
        new_digits[0] = 1;
        for (i = 1; i < new_digits.length; i++)
            new_digits[i] = 0;
        return new_digits;
    }
}


// // Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
// // Memory Usage: 38.3 MB, less than 5.64% of Java online submissions for Plus One.

// class Solution {
//     public int[] plusOne(int[] digits) {
//         int length = digits.length;
//         if (digits[length-1] != 9) {
//             digits[length-1]++;
//             return digits;
//         } else {
//             int count_nine = 0;
//             for (int i = length-1; i >= 0; i--){
//                 if (digits[i] == 9){
//                     count_nine++;
//                 } else {
//                     break;
//                 }
//             }
//             if (count_nine != length) {
//                 digits[length-count_nine-1]++;
//                 for (int i = length-count_nine; i < length; i++)
//                     digits[i] = 0;
//                 return digits;
//             } else {
//                 int new_digits[] = new int[length+1];
//                 new_digits[0] = 1;
//                 return new_digits;
//             }
//         }
//     }
// }