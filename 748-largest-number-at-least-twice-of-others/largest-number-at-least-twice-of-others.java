class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int largestidx = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                sec = largest;
                largest = nums[i];
                largestidx = i;
            }
            if(nums[i]<largest && nums[i]>sec){
                sec = nums[i];
            }
        }
        if(largest >= 2*sec){
            return largestidx ;
        }
        else{
            return -1;
        }
    }
}