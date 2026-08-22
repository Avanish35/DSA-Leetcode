class Solution {
    private void rev(int[] nums, int s, int e){
        while(s<=e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
        s++;
        e--;
        }
    }
    public void rotate(int[] nums, int k) {
        if(k%nums.length==0){
            return;
        }
        k = k % nums.length;
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
}