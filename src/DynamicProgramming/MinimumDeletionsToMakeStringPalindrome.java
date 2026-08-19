package DynamicProgramming;

import java.util.Arrays;

public class MinimumDeletionsToMakeStringPalindrome {
    static int minDeletions(String s) {
        return s.length()-longestPalindromeSubsequence(s);
    }

    public static int longestPalindromeSubsequence(String s) {
        String r = reverse(s);
        return longestCommonSubsequence(s, r);
    }

    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static int[][] dp;
    public static int longestCommonSubsequence(String a, String b) {
        int l1 = a.length(), l2 = b.length();
        dp = new int[l1][l2];
        for (int i = 0; i < l1; i++) {
            Arrays.fill(dp[i], -1);
        }
        return lcs(l1-1,  l2-1, new StringBuilder(a), new StringBuilder(b));
    }

    public static int lcs(int i, int j, StringBuilder a, StringBuilder b) {
        if(i < 0 || j < 0) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)) return dp[i][j] = 1 + lcs(i-1, j-1, a, b);
        return dp[i][j] = Math.max(lcs(i, j-1, a, b),lcs(i-1, j, a, b));
    }
}
