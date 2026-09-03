class Solution {
    public int findNumbers(int[] nums) {
        int evencount = 0;
        for(int i=0; i<nums.length; i++){
            int len = String.valueOf(nums[i]).length();

            if(len%2==0){
                evencount++;
            }
        }
        return evencount;
    }
}