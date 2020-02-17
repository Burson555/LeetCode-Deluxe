// Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Image.
// Memory Usage: 38.6 MB, less than 5.77% of Java online submissions for Rotate Image.

class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length, iter = length/2;
        for (int i = 0; i < iter; i ++) {
            for (int j = i; j < length-i-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[length-j-1][i];
                matrix[length-j-1][i] = matrix[length-i-1][length-j-1];
                matrix[length-i-1][length-j-1] = matrix[j][length-i-1];
                matrix[j][length-i-1] = temp;
            }
        }
    }
}


// // Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Image.
// // Memory Usage: 38.6 MB, less than 5.77% of Java online submissions for Rotate Image.
// // Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Image.
// // Memory Usage: 39 MB, less than 5.77% of Java online submissions for Rotate Image.

// class Solution {
//     public void rotate(int[][] matrix) {
//         int r = matrix.length, c = matrix[0].length;
//         for (int i = 0; i < r/2; i++) {
//             for (int j = 0; j < c; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[r-i-1][j];
//                 matrix[r-i-1][j] = temp;
//             }
//         }
//         for (int i = 0; i < r; i++) {
//             for (int j = i+1; j < c; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }
//     }
// }