class Solution {
    public void setZeroes(int[][] matrix) {
        int  m = matrix.length;
        int n = matrix[0].length;

        boolean[] zeroRows = new boolean[m];
        boolean[] zeroColumn = new boolean[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix [i][j] == 0){
                    zeroRows[i] = true;
                    zeroColumn[j] = true;
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(zeroRows[i] || zeroColumn[j]){
                    matrix[i][j] = 0;
                }
            }
        }   
    }
}