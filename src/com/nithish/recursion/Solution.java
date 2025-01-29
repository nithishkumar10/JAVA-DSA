package com.nithish.recursion;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }
    static int sumOfSeries(int n) {
        // code here
        if(n == 1){
            return (int)(Math.pow(n, 3));
        }
        int ans = (int)(Math.pow(n, 3)) + sumOfSeries(n - 1);
        return ans;
    }
}
