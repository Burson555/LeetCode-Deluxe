class Solution {
    public int countNegatives(int[][] grid) {
        int r = 0, count = 0;
        while (r < grid.length) {
            int c = 0;
            while (c < grid[0].length && grid[r][c] >= 0) {
                c++;
            }
            count += (grid[0].length - c);
            r++;
        }
        return count;
    }
}