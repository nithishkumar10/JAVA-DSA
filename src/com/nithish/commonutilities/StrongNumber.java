package com.nithish.commonutilities;

public class StrongNumber {
    public static void main(String[] args) {
        int n = 2;
        int temp = n;
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans += fact(rem);
            n /= 10;
        }
        if(ans == temp){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    static int fact(int n){
        if(n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}
