package com.nithish.commonutilities;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
//        System.out.print(n1 + " " + n2 + " ");
        for(int i = 2; i <= 15; i++){
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(n3);
    }
}
