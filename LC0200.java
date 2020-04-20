// Runtime: 2 ms, faster than 41.74% of Java online submissions for Number of Islands.
// Memory Usage: 44.8 MB, less than 5.12% of Java online submissions for Number of Islands.

class Solution {
    
    private int n;
    private int m;
    
    public int numIslands(char[][] grid) {
        n = grid.length;
        if (n == 0) return 0;
        m = grid[0].length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != '0') {
                    sink(grid, i, j);
                    count += 1;
                }
            }
        }
        return count;
    }
    
    private void sink(char[][] grid, int i, int j) {
        if (i < 0 || i >= n) return;
        if (j < 0 || j >= m) return;
        if (grid[i][j] == '0') return;
        grid[i][j] = '0';
        sink(grid, i-1, j);
        sink(grid, i+1, j);
        sink(grid, i, j-1);
        sink(grid, i, j+1);
    }
}