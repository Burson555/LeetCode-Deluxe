// Runtime: 5 ms, faster than 99.84% of Java online submissions for Island Perimeter.
// Memory Usage: 40 MB, less than 100.00% of Java online submissions for Island Perimeter.

class Solution {
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        int n = grid.length;
        if (n == 0) return res;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) continue;
                boolean is_top = (i == 0);
                boolean is_left = (j == 0);
                boolean has_top = (i > 0 && grid[i-1][j] == 1);
                boolean has_left = (j > 0 && grid[i][j-1] == 1);
                if (is_top) res += 2;
                if (is_left) res += 2;
                if (!is_top && !has_top) res += 2;
                if (!is_left && !has_left) res += 2;
            }
        }
        return res;
    }
}