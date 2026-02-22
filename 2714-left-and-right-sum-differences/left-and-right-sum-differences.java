class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int[] result = new int[nums.length];
        int total = 0;
        for(int num:nums){
            total += num;
        }

        int leftsum = 0;
        for(int i=0; i<nums.length; i++){
            int rightsum = total - leftsum - nums[i];
            result[i]  = Math.abs(leftsum - rightsum);
            leftsum += nums[i];
        }
        return result;
    }
}