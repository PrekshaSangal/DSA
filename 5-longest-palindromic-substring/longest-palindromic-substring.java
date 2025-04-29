class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int maxLen = 1;
        int start = 0;

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i == 1) {
                        dp[i][j] = 2;
                    } else if (dp[i + 1][j - 1] > 0) {
                        dp[i][j] = 2 + dp[i + 1][j - 1];
                    }
                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        start = i;
                    }
                }
            }
        }

        return s.substring(start, start + maxLen);
    }
}
