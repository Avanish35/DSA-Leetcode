class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] result = new long[n];

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (List<Integer> indices : map.values()) {
            int size = indices.size();

            long leftSum = 0;
            long rightSum = 0;

            for (int idx : indices) {
                rightSum += idx;
            }
            rightSum -= (long) size * indices.get(0);

            for (int i = 0; i < size; i++) {
                int idx = indices.get(i);
                result[idx] = leftSum + rightSum;
                if (i + 1 < size) {
                    int gap = indices.get(i + 1) - indices.get(i);

                    leftSum += (long) gap * (i + 1);
                    rightSum -= (long) gap * (size - i - 1);
                }
            }
        }
        return result;
    }
}