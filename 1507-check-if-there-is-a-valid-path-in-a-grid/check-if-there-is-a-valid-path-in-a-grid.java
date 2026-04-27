class Solution {
    public boolean hasValidPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        int[][][] moves = {
            {},
            {{0,-1},{0,1}},   
            {{-1,0},{1,0}},      
            {{0,-1},{1,0}},      
            {{0,1},{1,0}},       
            {{0,-1},{-1,0}},    
            {{0,1},{-1,0}}     
        };

        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        visited[0][0] = true;

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            if(x == m-1 && y == n-1) return true;

            for(int[] move : moves[grid[x][y]]) {
                int nx = x + move[0];
                int ny = y + move[1];

                if(nx < 0 || ny < 0 || nx >= m || ny >= n || visited[nx][ny])
                    continue;

                for(int[] back : moves[grid[nx][ny]]) {
                    if(nx + back[0] == x && ny + back[1] == y) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return false;
    }
}
