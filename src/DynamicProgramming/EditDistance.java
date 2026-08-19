package DynamicProgramming;

import java.util.Arrays;

public class EditDistance {
    public int minDistance(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                if(a.charAt(i) == b.charAt(j))  dp[i][j] = (i-1 >= 0 && j-1 >= 0) ? dp[i-1][j-1] : 0;
                else{
                    int replace = 1 + ((i-1 >= 0 && j-1 >= 0) ? dp[i-1][j-1] : 0) ;
                    int remove = 1 + ((i-1 >= 0 ) ? dp[i-1][j] : j+1);
                    int insert = 1 + ((j-1 >= 0) ? dp[i][j-1] : i+1);
                    dp[i][j] = Math.min(replace, Math.min(remove, insert));
                }
            }
        }
        return dp[m-1][n-1];
    }

//    static int[][] dp;
//    public int minDistance(String a, String b) {
//        dp = new int[a.length()][b.length()];
//        for (int i = 0; i < a.length(); i++) {
//            Arrays.fill(dp[i], -1);
//        }
//        int i = a.length(), j = b.length();
//        return minD(i-1, j-1, a, b);
//    }
//
//    private int minD(int i, int j, String a, String b) {
//        if(i < 0) return j + 1; // inserting remaining char of b
//        if(j < 0) return i + 1; // remove extra char of a;
//        if(dp[i][j] != -1) return dp[i][j];
//        if(a.charAt(i) == b.charAt(j)) return dp[i][j] = minD(i - 1, j - 1, a, b);
//        int replace = 1 + minD(i-1, j-1, a, b);
//        int remove = 1 + minD(i-1, j, a, b);
//        int insert = 1 + minD(i, j-1, a, b);
//        return dp[i][j] = Math.min(replace, Math.min(remove, insert));
//    }
}
