class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i,j});
                }else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        if (fresh == 0) return 0;

        int minutes = 0;

        int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        // bfs
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];

                for(int d=0; d<4; d++){
                    int nr = r + directions[d][0];
                    int nc = c + directions[d][1];

                    if(nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        queue.offer(new int[]{nr,nc});
                        fresh--;
                    }
                }
            }
            minutes++;
        }
        return fresh == 0? minutes -1 : -1;
    }
}