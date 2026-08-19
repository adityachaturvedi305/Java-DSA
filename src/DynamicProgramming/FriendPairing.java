package DynamicProgramming;

public class FriendPairing {
    public long countFriendsPairings(int n) {
        long[] dp = new long[4];
        dp[1] = 1;
        if(n > 1) dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[3] = dp[2] + (i-1)*dp[1];
            dp[1] = dp[2];
            dp[2] = dp[3];
        }
        return dp[3];
    }

//    public long countFriendsPairings(int n) {
//        long[] dp = new long[n+1];
//        dp[1] = 1;
//        if(n > 1) dp[2] = 2;
//        for(int i = 3; i <= n; i++){
//            dp[i] = dp[i-1] + (i-1)*dp[i-2];
//        }
//        return dp[n];
//    }

//    static long[] dp;
//    public long countFriendsPairings(int n) {
//        dp = new long[n+1];
//        return pairs(n);
//    }
//
//    public long pairs(int n){
//        if(n <= 2) return n;
//        if(dp[n] != 0) return dp[n];
//        return dp[n] = pairs(n-1) + (n-1)*pairs(n-2);
//    }

//    public long countFriendsPairings(int n) {
//        if(n <= 2) return n;
//        return countFriendsPairings(n-1) + (n-1)*countFriendsPairings(n-2);
//    }
}
