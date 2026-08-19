package DynamicProgramming;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int n = s.length() , max = 0;
        int[][] dp = new int[n][n];
        String ans = "";
        for(int k = 0; k < n; k++){
            int i = 0, j = k;
            while(j < n){
                if(i == j){
                    dp[i][j] = 1;
                    if(max < j-i+1){
                        max = j-i+1;
                        ans = s.substring(i, j+1);
                    }
                }
                else {
                    boolean check = s.charAt(i) == s.charAt(j);
                    if(j == i+1){
                        if(check){
                            dp[i][j] = 1;
                            if(max < j-i+1){
                                max = j-i+1;
                                ans = s.substring(i, j+1);
                            }
                        }
                    }
                    else {
                        if(check){
                            if(dp[i+1][j-1] == 1){
                                dp[i][j] = 1;
                                if(max < j-i+1){
                                    max = j-i+1;
                                    ans = s.substring(i, j+1);
                                }
                            }
                        }
                    }
                }
                i++; j++;
            }
        }
        return ans;
    }
}
