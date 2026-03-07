class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        
        while(top <= bottom && left <= right){
            
            // Step 1: Go RIGHT along top row
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            
            // Step 2: Go DOWN along right column
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            // Step 3: Go LEFT along bottom row
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // Step 4: Go UP along left column
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}