class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max_size=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    int island_size = dfs(grid,i,j);
                    max_size = Math.max(max_size, island_size);
                }
            }
        }
        return max_size;
    }
    int dfs(int[][] grid, int r, int c){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length) return 0;
        if(grid[r][c]==0) return 0;

        grid[r][c] = 0;

        return 1 + dfs(grid, r-1, c) + dfs(grid, r+1, c) + dfs(grid, r, c+1) + dfs(grid, r, c-1);
    }
}