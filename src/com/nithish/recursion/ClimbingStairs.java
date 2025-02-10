package com.nithish.recursion;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(44));
//        1134903170
    }
    public static int climbStairs(int n) {
        // dp[i] := the number of ways to climb to the i-th stair
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; ++i)
            dp[i] = dp[i - 1] + dp[i - 2];

        return dp[n];
    }
    static int ans(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        int one = ans(n - 1);
        int two = ans(n - 2);
        return one + two;
    }
}
