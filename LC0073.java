// Runtime: 1 ms, faster than 95.91% of Java online submissions for Set Matrix Zeroes.
// Memory Usage: 42.1 MB, less than 97.14% of Java online submissions for Set Matrix Zeroes.
// Runtime: 1 ms, faster than 95.91% of Java online submissions for Set Matrix Zeroes.
// Memory Usage: 41.9 MB, less than 97.14% of Java online submissions for Set Matrix Zeroes.

class Solution {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        boolean set_1st_r = false;
        boolean set_1st_c = false;
        for (int i = 1; i < matrix.length; i++) 
            if (matrix[i][0] == 0)
                set_1st_c = true;
        for (int i = 1; i < matrix[0].length; i++)
            if (matrix[0][i] == 0)
                set_1st_r = true;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++)
            if (matrix[i][0] == 0) {
                for (int j = 1; j < matrix[0].length; j++)
                    matrix[i][j] = 0;
            }
        for (int j = 1; j < matrix[0].length; j++)
            if (matrix[0][j] == 0) {
                for (int i = 1; i < matrix.length; i++)
                    matrix[i][j] = 0;
            }
        if (matrix[0][0] == 0 || set_1st_r)
            for (int j = 1; j < matrix[0].length; j++)
                    matrix[0][j] = 0;
        if (matrix[0][0] == 0 || set_1st_c)
            for (int i = 1; i < matrix.length; i++)
                    matrix[i][0] = 0;
        if (set_1st_r || set_1st_c)
            matrix[0][0] = 0;
    }
}