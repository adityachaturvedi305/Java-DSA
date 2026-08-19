package DynamicProgramming;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++){
                if(a.charAt(i-1) == b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
//    public int longestCommonSubsequence(String a, String b) {
//        int m = a.length(), n = b.length();
//        int[][] dp = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for(int j = 0; j < n; j++){
//                int x = (i-1 >= 0 && j-1 >= 0) ? dp[i-1][j-1] : 0;
//                int y = (j-1 >= 0) ? dp[i][j-1] : 0;
//                int z = (i-1 >= 0) ? dp[i-1][j] : 0;
//                if(a.charAt(i) == b.charAt(j)) dp[i][j] = 1 + x;
//                else dp[i][j] = Math.max(y,z);
//            }
//        }
//        return dp[m -1][n-1];
//    }

//    static int[][] dp;
//    public int longestCommonSubsequence(String a, String b) {
//        int l1 = a.length(), l2 = b.length();
//        dp = new int[l1][l2];
//        for (int i = 0; i < l1; i++) {
//            Arrays.fill(dp[i], -1);
//        }
//        return lcs(l1-1,  l2-1, new StringBuilder(a), new StringBuilder(b));
//    }
//
//    private int lcs(int i, int j, StringBuilder a, StringBuilder b) {
//        if(i < 0 || j < 0) return 0;
//        if (dp[i][j] != -1) return dp[i][j];
//        if(a.charAt(i) == b.charAt(j)) return dp[i][j] = 1 + lcs(i-1, j-1, a, b);
//        return dp[i][j] = Math.max(lcs(i, j-1, a, b),lcs(i-1, j, a, b));
//    }
}
