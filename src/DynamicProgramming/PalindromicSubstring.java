package DynamicProgramming;

public class PalindromicSubstring {
    public int countSubstrings(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int c = 0;
        for(int k = 0; k < n; k++){
            int i = 0, j = k;
            while(j < n){
                if(i == j){
                    dp[i][j] = 1;
                    c++;
                }
                else {
                    boolean check = s.charAt(i) == s.charAt(j);
                    if(j == i+1){
                        if(check){
                            dp[i][j] = 1;
                            c++;
                        }
                    }
                    else {
                        if(check){
                            if(dp[i+1][j-1] == 1){
                                dp[i][j] = 1;
                                c++;
                            }
                        }
                    }
                }
                i++; j++;
            }
        }
        return c;
    }
}
