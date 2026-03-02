class Solution {
    public String tictactoe(int[][] moves) {
        int[][] board = new int[3][3];
        
        // Place moves on board
        for(int i = 0; i < moves.length; i++) {
            int player = (i % 2 == 0) ? 1 : 2;
            board[moves[i][0]][moves[i][1]] = player;
        }
        
        // Check winner
        for(int p = 1; p <= 2; p++) {
            // Check rows
            for(int r = 0; r < 3; r++) {
                if(board[r][0]==p && board[r][1]==p && board[r][2]==p)
                    return p == 1 ? "A" : "B";
            }
            // Check columns
            for(int c = 0; c < 3; c++) {
                if(board[0][c]==p && board[1][c]==p && board[2][c]==p)
                    return p == 1 ? "A" : "B";
            }
            // Check diagonals
            if(board[0][0]==p && board[1][1]==p && board[2][2]==p)
                return p == 1 ? "A" : "B";
            if(board[0][2]==p && board[1][1]==p && board[2][0]==p)
                return p == 1 ? "A" : "B";
        }
        
        // Draw or Pending
        return moves.length == 9 ? "Draw" : "Pending";
    }
}