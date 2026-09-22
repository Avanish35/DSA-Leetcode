class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for(int i=0; i<expected.length; i++){
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        int count = 0;
        int i=0;
        int j=0;
        while(i<heights.length && j<expected.length){
            if(heights[i]!=expected[j]){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}