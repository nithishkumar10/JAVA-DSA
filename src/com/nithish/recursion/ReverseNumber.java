package com.nithish.recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(rev(12340));
        System.out.println(palin(12332));
    }
    static boolean palin(int n){
        return n == rev(n);
    }

    private static int rev(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits - 1);
    }
    static int helper(int n, int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return (int)(rem * Math.pow(10, digits)) + helper(n /10, --digits);
    }
}
