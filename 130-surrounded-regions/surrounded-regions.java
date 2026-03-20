class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i==0 || i==rows-1 || j==0 || j== cols-1){
                    if(board[i][j] == 'O'){
                        dfs(board, i, j);
                    }
                }
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(board[i][j]=='S') board[i][j] = 'O';
                else if(board[i][j] == 'O')board [i][j] = 'X';
            }
        }
    }
    void dfs(char[][] board, int r, int c){
        if(r<0 || r>=board.length || c<0 || c>=board[0].length) return ;
        if(board[r][c]!='O') return ;
        board[r][c] = 'S';
        dfs(board, r+1, c);
        dfs(board, r-1, c);
        dfs(board, r, c-1);
        dfs(board, r, c+1);
    }
}