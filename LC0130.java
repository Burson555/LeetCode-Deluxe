// this algorithm follows a check and set manner
// when we enounter a letter 'O'
// we first check whether it connects an 'O' on the edge
// if not, we sink this island

class Solution {
    
    private int n;
    private int m;
    
    public void solve(char[][] board) {
        n = board.length;
        if (n == 0) return;
        m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O' && isEnclosed(board, i, j))
                    sink(board, i, j);
            }
        }
    }

    private boolean isEnclosed(char[][] board, int i, int j) {
        if (i == 0 || i == n-1 || j == 0 || j == m-1) {
            if (board[i][j] == 'O') return false;
            else return true;
        }
        if (board[i][j] == 'X') return true;
        board[i][j] = 'X';
        boolean temp = isEnclosed(board, i+1, j) && isEnclosed(board, i-1, j) &&
                        isEnclosed(board, i, j+1) && isEnclosed(board, i, j-1);
        board[i][j] = 'O';
        return temp;
    }

    private void sink(char[][] board, int i, int j) {
        if (board[i][j] == 'X') return;
        board[i][j] = 'X';
        sink(board, i+1, j);
        sink(board, i-1, j);
        sink(board, i, j+1);
        sink(board, i, j-1);
    }
}