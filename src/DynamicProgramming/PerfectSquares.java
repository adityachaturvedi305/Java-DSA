package DynamicProgramming;
public class PerfectSquares {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) dp[i] = 1;
            else {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j * j <= i; j++) {
                    int count = dp[j * j] + dp[i - j * j];
                    min = Math.min(min, count);
                }
                dp[i] = min;
            }
        }
        return dp[n];
    }

    public boolean isPerfect(int n) {
        int root = (int)(Math.sqrt(n));
        return root*root == n;
    }

//    static int[] dp;
//    public int numSquares(int n) {
//        dp = new int[n + 1];
//        return minSquares(n);
//    }
//    public int minSquares(int n) {
//        if (n == 0) return 0;
//        if (isPerfect(n)) return 1;
//        if (dp[n] != 0) return dp[n];
//        int min = n;
//        for (int i = 1; i*i <= n; i++) {
//            int count = minSquares(i*i) + minSquares(n - i*i); // Changed
//            min = Math.min(min, count);
//        }
//        return dp[n] = min;
//    }
//
//    public boolean isPerfect(int n) {
//        int root = (int) Math.sqrt(n);
//        return root * root == n;
//    }

//    public int numSquares(int n) {
//        if(isPerfect(n)) return 1;
//        int min = n;
//        for(int i = 1; i <= n/2; i++){
//            int count = numSquares(i) + numSquares(n-i);
//            min = Math.min(min, count);
//        }
//        return min;
//    }
//
//    public boolean isPerfect(int n) {
//        int root = (int)(Math.sqrt(n));
//        return root*root == n;
//    }
}
