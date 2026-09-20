class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            if(i == arr.length-1){
                res[i] = -1;
            }
            else{
                int max = arr[i+1];
                for(int j=i+2;j<arr.length; j++){
                    if(arr[j]>max){
                        max = arr[j];
                    }
                }
                res[i] = max;
            }
        }
        return res;
    }
}