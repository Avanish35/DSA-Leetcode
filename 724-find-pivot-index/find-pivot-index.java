class Solution {
    public int pivotIndex(int[] nums) {
        int tot = 0;
        for(int i =0; i<nums.length;i++){
            tot += nums[i]; 
        }
        int sumright = 0;
        int sumleft = 0;
        for(int i = 0; i<nums.length; i++){
            sumright = tot-sumleft - nums[i];
            if(sumright==sumleft){
                return i;
            }
            sumleft += nums[i]; 
        }
        return -1;
    }
}