class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            int digit1 = s.charAt(i) - '0';
            int digit2 = s.charAt(i + 1) - '0';
            if (Math.abs(digit1 - digit2) > 2) {
                return false;
            }
        }
        return true;
    }
}