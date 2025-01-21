package com.nithish.commonutilities;

public class LeapYear {

    public static void main(String[] args) {
        int count = 0;
        for(int i = 1900; i <= 2000; i++){
            if(isLeapYear(i)){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }

    static boolean isLeapYear(int year){
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }
        return false;
    }
}
