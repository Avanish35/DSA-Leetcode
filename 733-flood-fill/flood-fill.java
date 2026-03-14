class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int startColor = image[sr][sc];

        if (startColor == newColor) return image;
        
        int rows = image.length;
        int cols = image[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});
        image[sr][sc] = newColor; 
        
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
                    image[nextRow][nextCol] == startColor) {
                    
                    image[nextRow][nextCol] = newColor;  // fill
                    queue.add(new int[]{nextRow, nextCol});
                }
            }
        }
        return image;
    }
}