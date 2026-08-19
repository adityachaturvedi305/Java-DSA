package DynamicProgramming;

public class ShortestCommonSuperSequence {
    public String shortestCommonSupersequence(String a, String b) {
        StringBuilder ans = new StringBuilder();
        String lcs = longestCommonSeq(a, b);
        int i = 0, j = 0, k = 0;
        while (i < a.length() && j < b.length() && k < lcs.length()) {
            if (a.charAt(i) != lcs.charAt(k)) {
                ans.append(a.charAt(i));
                i++;
            }
            else if (b.charAt(j) != lcs.charAt(k)) {
                ans.append(b.charAt(j));
                j++;
            }
            else {
                ans.append(lcs.charAt(k));
                i++;
                j++;
                k++;
            }
        }
        while (i < a.length()) {
            ans.append(a.charAt(i));
            i++;
        }
        while (j < b.length()) {
            ans.append(b.charAt(j));
            j++;
        }
        return ans.toString();
    }

    public String longestCommonSeq(String a, String b){
        int m = a.length(), n = b.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++){
                if(a.charAt(i-1) == b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        // now printing lcs
        StringBuilder ans = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0){
            if(a.charAt(i-1) == b.charAt(j-1)){
                ans.append(a.charAt(i-1));
                i--; j--;
            }
            else {
                if(dp[i-1][j] >= dp[i][j-1]) i--;
                else j--;
            }
        }
        return ans.reverse().toString();
    }
}
