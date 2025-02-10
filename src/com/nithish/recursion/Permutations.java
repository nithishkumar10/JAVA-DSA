package com.nithish.recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        permutations("", "abc");
        ArrayList<String> list = permutationsRet("", "abc");
        System.out.println(list);
        permutations("", "abc");
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        int n = p.length();
        for(int i = 0; i <= n; i++){
            String f = p.substring(0,i);
            String s = p.substring(i, n);
            permutations(f + up.charAt(0) + s, up.substring(1));
        }
    }
    static ArrayList<String> permutationsRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }
        ArrayList<String> main = new ArrayList<>();
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            main.addAll(permutationsRet(f + up.charAt(0) + s, up.substring(1)));
        }
        return main;
    }
}
