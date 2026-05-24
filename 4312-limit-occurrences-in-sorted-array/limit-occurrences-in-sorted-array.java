class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int[] temp = new int[nums.length];
        int ind = 0;
        int count = 1;
        temp[ind++] = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count<=k){
                temp[ind++]= nums[i];
            }
        }
        int[] res = new int[ind];
        for(int i=0; i<ind; i++){
            res[i] = temp[i];
        }
        return res;
    }
}