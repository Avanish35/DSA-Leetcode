class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); 
        
        int prefixSum = 0;
        int result = 0;
        
        for (int i = 0; i < nums.length; i++) {
            prefixSum += (nums[i] % 2);
            result += prefixCount.getOrDefault(prefixSum - k, 0);

            prefixCount.put(prefixSum, prefixCount.getOrDefault(prefixSum, 0) + 1);
        }
        
        return result;
    }
}