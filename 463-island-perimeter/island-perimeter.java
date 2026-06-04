class Solution {
    public int islandPerimeter(int[][] grid) {
        int islands = 0;
        int neighbors = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    islands++;

                    if (r + 1 < rows && grid[r + 1][c] == 1) {
                        neighbors++;
                    }

                    if (c + 1 < cols && grid[r][c + 1] == 1) {
                        neighbors++;
                    }
                }
            }
        }

        return islands * 4 - neighbors * 2;
    }
}