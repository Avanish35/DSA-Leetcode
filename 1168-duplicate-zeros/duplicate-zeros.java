class Solution {
    public void duplicateZeros(int[] arr) {
        int[] res = new int[arr.length];
        int s = 0, d = 0;

        while(s<arr.length){
            if(arr[s]==0){
                if(d<arr.length){
                    res[d] = 0;
                }
                d++;
                if(d<arr.length){
                    res[d] = 0;
                }
            }else{
                if(d<arr.length){
                    res[d] = arr[s];
                }
            }
            d++;
            s++;
        }
        for(int i = 0; i<res.length; i++){
            arr[i] = res[i];
        }
    }
}