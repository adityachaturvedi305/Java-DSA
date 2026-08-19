package DynamicProgramming;

public class CountDerangement {
    public int derangeCount(int n) {
        if(n <= 3) return n-1;
        int[] dp = new int[n+1];
        dp[1] = 0;
        dp[2] = 1;
        for(int i = 3; i <= n; i++){
            dp[3] = (i-1)*(dp[2] + dp[1]);
            dp[1] = dp[2];
            dp[2] = dp[3];
        }
        return dp[2];
    }

//    public int derangeCount(int n) {
//        if(n <= 3) return n-1;
//        int[] dp = new int[n+1];
//        dp[1] = 0;
//        dp[2] = 1;
//        for(int i = 3; i <= n; i++){
//            dp[i] = (i-1)*(dp[i-1] + dp[i-2]);
//        }
//        return dp[n];
//    }

//    static int[] dp;
//    public int derangeCount(int n) {
//        dp = new int[n+1];
//        return counts(n);
//    }
//
//    public int counts(int n) {
//        if(n <= 3) return n-1;
//        if(dp[n] != 0) return dp[n];
//        return dp[n] = (n-1)*(counts(n-1) + counts(n-2));
//    }

//    public int derangeCount(int n) {
//        return counts(n);
//    }
//
//    public int counts(int n) {
//        if(n <= 3) return n-1;
//        return (n-1)*(counts(n-1) + counts(n-2));
//    }
}
