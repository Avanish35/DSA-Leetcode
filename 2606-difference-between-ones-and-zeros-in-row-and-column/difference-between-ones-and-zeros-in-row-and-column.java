class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] rowones = new int[m];
        int[] colsones = new int[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    rowones[i]++;
                    colsones[j]++;
                }
            }
        }

        int[][] diff = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int onesRowi = rowones[i];
                int onesColsj = colsones[j];
                int zeroRowi = n - rowones[i];
                int zeroColsj = m - colsones[j];
                diff[i][j] = onesRowi + onesColsj - zeroRowi - zeroColsj;
            }
        }
        return diff;
    }
}