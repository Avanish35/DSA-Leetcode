class Solution {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;
        char[] res = new char[n];

        // Step 1: Build string
        char cur = 'a';
        for (int i = 0; i < n; i++) {
            if (res[i] != 0) continue;

            if (cur > 'z') return ""; // only 26 chars allowed

            for (int j = i; j < n; j++) {
                if (lcp[i][j] > 0) {
                    res[j] = cur;
                }
            }
            cur++;
        }

        // Step 2: Validate LCP
        int[][] calc = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (res[i] == res[j]) {
                    if (i == n - 1 || j == n - 1) {
                        calc[i][j] = 1;
                    } else {
                        calc[i][j] = 1 + calc[i + 1][j + 1];
                    }
                } else {
                    calc[i][j] = 0;
                }

                if (calc[i][j] != lcp[i][j]) {
                    return "";
                }
            }
        }

        return new String(res);
    }
}