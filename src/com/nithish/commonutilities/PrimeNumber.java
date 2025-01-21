package com.nithish.commonutilities;

public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i <101; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
