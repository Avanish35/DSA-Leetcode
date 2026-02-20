class NumArray {
    int newsum[];
    public NumArray(int[] nums) {
        int sum=0;
        newsum=new int[nums.length];

        for(int i =0; i<nums.length; i++){
            sum = sum + nums[i];
            newsum[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return newsum[right];
        }
        return newsum[right]-newsum[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */