class Solution {
    public int maxProduct(int[] nums) {
        int product = 1;
        int maxpro = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){ // forward loop
            product = product*nums[i];
            maxpro = Math.max(maxpro , product);
            if(product==0)product = 1;
        }
        product = 1;
        
        for(int i = nums.length-1; i>=0; i--){  // backword loop
            product = product*nums[i];
            maxpro = Math.max(maxpro , product);
            if(product==0)product = 1;
        }
        return maxpro;
    }
}