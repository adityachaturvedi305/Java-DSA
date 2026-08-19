package DynamicProgramming;

public class PrintLongestCommonSubsequence {
    public static void main(String[] args) {
        String a = "anuj";
        String b = "anjum";
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
        System.out.println(ans.reverse());
    }
}
