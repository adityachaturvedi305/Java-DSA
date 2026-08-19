package DynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubstring {
    public int longCommSubstr(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m+1][n+1];
        int max = 0;
        for (int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++){
                if(a.charAt(i-1) == b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = 0;
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }

//    static int[][] dp;
//    static int maxLen;
//    public int longCommSubstr(String a, String b) {
//        int m = a.length(), n = b.length();
//        dp = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            Arrays.fill(dp[i], -1);
//        }
//        maxLen = 0;
//        lcs(m - 1, n - 1, new StringBuilder(a), new StringBuilder(b));
//        return maxLen;
//    }
//
//    private int lcs(int i, int j, StringBuilder a, StringBuilder b) {
//        if (i < 0 || j < 0) return 0;
//        if (dp[i][j] != -1) return dp[i][j];
//        int len = 0;
//        if (a.charAt(i) == b.charAt(j)) {
//            len = 1 + lcs(i - 1, j - 1, a, b);
//            maxLen = Math.max(maxLen, len);
//        }
//        else {
//            lcs(i - 1, j, a, b);
//            lcs(i, j - 1, a, b);
//            len = 0;
//        }
//        return dp[i][j] = len;
//    }

//    static int maxLen;
//    public int longCommSubstr(String a, String b) {
//        int m = a.length(), n = b.length();
//        maxLen = 0;
//        lcs(m-1, n-1, new StringBuilder(a), new StringBuilder(b));
//        return maxLen;
//    }
//
//    private int lcs(int i, int j, StringBuilder a, StringBuilder b) {
//        if(i < 0 || j < 0) return 0;
//        if(a.charAt(i) == b.charAt(j)){
//            int len = 1 + lcs(i-1, j-1, a, b);
//            maxLen = Math.max(maxLen, len);
//            return len;
//        }
//        else{
//            int len  = Math.max(lcs(i, j-1, a, b),lcs(i-1, j, a, b));
//            maxLen = Math.max(maxLen, len);
//            return 0;
//        }
//    }

}
