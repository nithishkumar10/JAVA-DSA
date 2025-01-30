package com.nithish.recursion;

public class Solution {
    public static void main(String[] args) {
//        System.out.println(sumOfNnumbers(5));
//        System.out.println(sumOfDigits(1235));
        System.out.println(prodOfDigits(1255));
//        System.out.println(120 % 10);

        System.out.println(countZeros(30210004, 0));

    }
    static int sumOfSeries(int n) {
        // code here
        if(n == 1){
            return (int)(Math.pow(n, 3));
        }
        int ans = (int)(Math.pow(n, 3)) + sumOfSeries(n - 1);
        return ans;
    }
    static int sumOfNnumbers(int n){
        if(n <= 1){
            return n;
        }
        int ans = n + sumOfNnumbers(n - 1);
        return ans;
    }
    static int sumOfDigits(int n){
        if(n <= 0){
            return 0;
        }
        int ans = (n % 10) + sumOfDigits(n /10);
        return ans;
    }
    static int prodOfDigits(int n){
        if(n <= 0){
            return 1;
        }
        return (n % 10) * prodOfDigits(n /10);
    }
    static int countZeros(int n, int count){
        if(n == 0){
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            return countZeros(n /10, count + 1);
        }

        return countZeros(n /10, count);
    }
}
