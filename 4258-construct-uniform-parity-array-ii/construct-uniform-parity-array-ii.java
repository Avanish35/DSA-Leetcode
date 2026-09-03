class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int minOdd = Integer.MAX_VALUE;

        for (int x : nums1) {
            if (x % 2 == 1) {
                minOdd = Math.min(minOdd, x);
            }
        }

        return isValidForParity(nums1, 0, minOdd) || isValidForParity(nums1, 1, minOdd);
    }

    private boolean isValidForParity(int[] nums1, int p, int minOdd) {
        for (int x : nums1) {
            if (x % 2 == p) {
                continue;
            }
            if (!(minOdd < x)) {
                return false;
            }
        }
        return true;
    }
}