class Solution {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> freq = new HashMap<>();

        for (int num : nums) {
            long x = num;
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        int ans = 1;

        // Special case for 1
        if (freq.containsKey(1L)) {
            int count = freq.get(1L);
            ans = (count % 2 == 0) ? count - 1 : count;
        }

        for (long start : freq.keySet()) {
            if (start == 1L) continue;

            long x = start;
            int len = 0;

            while (freq.getOrDefault(x, 0) >= 2) {
                len += 2;
                x = x * x;
            }

            if (freq.getOrDefault(x, 0) >= 1) {
                len++;
            } else {
                len--;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}