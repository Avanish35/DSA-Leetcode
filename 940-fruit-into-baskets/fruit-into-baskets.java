class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits == null || fruits.length == 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;        // left pointer
        int maxLen = 0;

        for (int right = 0; right < fruits.length; right++) {   // right pointer
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                int leftFruit = fruits[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                left++;   // shrink window from the left
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
