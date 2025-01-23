package com.nithish.bitwise;

public class OddorEven {
    public static void main(String[] args) {
        int n = 556;
        System.out.println(isOdd(n));
        System.out.println(n);
    }

    private static boolean isOdd(int n) {
        if((n & 1) == 1){
            return true;
        }
        return false;
    }
}
