class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int num : nums){
            String s = String.valueOf(num);
            for(char ch : s.toCharArray()){
                int digit = ch - '0';
                res.add(digit);
            }
        }
        int[] ans = new int[res.size()];
        for(int i=0; i<res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}