// Runtime: 4 ms, faster than 44.33% of Java online submissions for Valid Sudoku.
// Memory Usage: 40.6 MB, less than 98.55% of Java online submissions for Valid Sudoku.

// StringBuilder is really FAST.
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                char curr = board[i][j];
                StringBuilder sb_1 = new StringBuilder();
                StringBuilder sb_2 = new StringBuilder();
                StringBuilder sb_3 = new StringBuilder();
                sb_1.append(i).append("(").append(curr).append(")");
                sb_2.append("(").append(curr).append(")").append(j);
                sb_3.append(i/3).append("(").append(curr).append(")").append(j/3);
                if (!hs.add(sb_1.toString()) || !hs.add(sb_2.toString()) || !hs.add(sb_3.toString()))
                    return false;
            }
        }
        return true;
    }
}


// // Runtime: 16 ms, faster than 8.39% of Java online submissions for Valid Sudoku.
// // Memory Usage: 42.2 MB, less than 97.10% of Java online submissions for Valid Sudoku.
// // Runtime: 16 ms, faster than 8.53% of Java online submissions for Valid Sudoku.
// // Memory Usage: 42 MB, less than 97.10% of Java online submissions for Valid Sudoku.
// // Runtime: 15 ms, faster than 9.91% of Java online submissions for Valid Sudoku.
// // Memory Usage: 42.1 MB, less than 97.10% of Java online submissions for Valid Sudoku.
// // Runtime: 15 ms, faster than 9.91% of Java online submissions for Valid Sudoku.
// // Memory Usage: 42.1 MB, less than 97.10% of Java online submissions for Valid Sudoku.

// class Solution {
//     public boolean isValidSudoku(char[][] board) {
//         HashSet<String> hs = new HashSet<>();
//         for (int i = 0; i < 9; i++) {
//             for (int j = 0; j < 9; j++) {
//                 if (board[i][j] == '.') continue;
//                 char curr = board[i][j];
//                 String base = "(" + curr + ")";
//                 if (!hs.add(i+base) || !hs.add(base+j) || !hs.add(i/3+base+j/3))
//                     return false;
//             }
//         }
//         return true;
//     }
// }