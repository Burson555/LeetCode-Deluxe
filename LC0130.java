// Runtime: 3 ms, faster than 33.16% of Java online submissions for Surrounded Regions.
// Memory Usage: 48.9 MB, less than 7.14% of Java online submissions for Surrounded Regions.

class Solution {
    
    private int n;
    private int m;
    
    public void solve(char[][] board) {
        n = board.length;
        if (n == 0) return;
        m = board[0].length;
        
        // scan first and last row
        for (int i = 0; i < m; i++) {
            if (board[0][i] == 'O') boundary_sink(board, 0, i);
            if (board[n-1][i] == 'O') boundary_sink(board, n-1, i);
        }
        
        // scan first and last column
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') boundary_sink(board, i, 0);
            if (board[i][m-1] == 'O') boundary_sink(board, i, m-1);
        }
        
        // final conversion
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == '*') board[i][j] = 'O';
            }
        }
    }

    private void boundary_sink(char[][] board, int i, int j) {
        if ((0 <= i && i <= n-1 && 0 <= j && j <= m-1)
           && board[i][j] == 'O') {
            board[i][j] = '*';
            boundary_sink(board, i-1, j);
            boundary_sink(board, i+1, j);
            boundary_sink(board, i, j-1);
            boundary_sink(board, i, j+1);
        }
    }
}