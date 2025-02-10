package com.nithish.recursion;

import java.util.*;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceRet("", 5));
        //        dice("", 4);
    }
    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i <= 6 && i <= target; i++){
            dice(p + i, target - i);
        }
    }
    static List<String> diceRet(String p, int target){
        if(target == 0){
            List<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }
        List<String> list = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++){
            list.addAll(diceRet(p + i, target - i));
        }
        return list;
    }
}
