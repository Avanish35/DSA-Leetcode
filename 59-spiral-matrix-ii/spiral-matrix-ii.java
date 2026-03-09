class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int top = 0, bottom = n-1;
        int left = 0, right = n-1;
        int num = 1;
        
        while(top <= bottom && left <= right){
            // Go RIGHT
            for(int i = left; i <= right; i++)
                result[top][i] = num++;
            top++;
            
            // Go DOWN
            for(int i = top; i <= bottom; i++)
                result[i][right] = num++;
            right--;
            
            // Go LEFT
            if(top <= bottom){
                for(int i = right; i >= left; i--)
                    result[bottom][i] = num++;
                bottom--;
            }
            
            // Go UP
            if(left <= right){
                for(int i = bottom; i >= top; i--)
                    result[i][left] = num++;
                left++;
            }
        }
        return result;
    }
}