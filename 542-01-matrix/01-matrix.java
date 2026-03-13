class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0)
                    queue.add(new int[]{i, j});
                else
                    matrix[i][j] = -1; 
            }
        }

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            
            for (int[] direction : directions) {
                int nextRow = row + direction[0];
                int nextCol = col + direction[1];

                if (nextRow >= 0 && nextCol >= 0 && 
                    nextRow < rows && nextCol < cols && 
                    matrix[nextRow][nextCol] == -1) {
                    
                    matrix[nextRow][nextCol] = matrix[row][col] + 1;
                    queue.add(new int[]{nextRow, nextCol});
                }
            }
        }
        
        return matrix;
    }
}