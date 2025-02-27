public class climbingStrairs70 {
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        // base case
        dp[1] = 1;
        dp[2] = 2;
        // dp[i] = dp[i - 1] + dp[i - 2]
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        // return the last element of the dp array
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(n));
    }
}
