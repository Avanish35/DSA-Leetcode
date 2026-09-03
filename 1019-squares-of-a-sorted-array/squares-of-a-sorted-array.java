class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}