class Solution {

    public boolean isValidSudoku(char[][] matrix) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (matrix[i][j] == '.') {
                    continue;
                }

                if (!validate(matrix, i, j, matrix[i][j])) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean validate(char[][] matrix, int r, int c, char val) {

        for (int i = 0; i < 9; i++) {

            if (matrix[r][i] == val && i != c) {
                return false;
            }

            if (matrix[i][c] == val && i != r) {
                return false;
            }
            int sr = ((r / 3) * 3)+i/3;
            int sc = (c / 3) * 3+i%3;
            if (matrix[sr][sc] == val && (sr != r || sc != c)) {
                return false;
            }
        }
        return true;
    }
}