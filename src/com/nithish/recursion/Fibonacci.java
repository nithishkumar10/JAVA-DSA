package com.nithish.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibo(8));
        System.out.println((int)Math.pow(3, 3));
    }

     static int Fibo(int i) {
        if(i < 2){
            return i;
        }
        return Fibo(i - 1) + Fibo(i - 2);
    }
}
