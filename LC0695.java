// Runtime: 2 ms, faster than 99.30% of Java online submissions for Max Area of Island.
// Memory Usage: 40.3 MB, less than 96.30% of Java online submissions for Max Area of Island.

class Solution {
    
    private int n;
    private int m;
    
    public int maxAreaOfIsland(int[][] grid) {
        n = grid.length;
        if (n == 0) return 0;
        m = grid[0].length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0) {
                    res = Integer.max(res, sink(grid, i, j));
                }
            }
        }
        return res;
    }
    
    private int sink(int[][] grid, int i, int j) {
        if (i < 0 || i >= n) return 0;
        if (j < 0 || j >= m) return 0;
        if (grid[i][j] == 0) return 0;
        int res = 1;
        grid[i][j] = 0;
        res += sink(grid, i-1, j);
        res += sink(grid, i+1, j);
        res += sink(grid, i, j-1);
        res += sink(grid, i, j+1);
        return res;
    }
}