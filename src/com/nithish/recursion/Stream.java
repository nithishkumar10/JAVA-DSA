package com.nithish.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class Stream {
    public static void main(String[] args) {
        ArrayList<String> ans = subset("", "abc");
        Collections.sort(ans);
        System.out.println(ans);
    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        }else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skipWord(String up, String target){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith(target)){
            return skipWord(up.substring(target.length()), target);
        }
        return up.charAt(0) + skipWord(up.substring(1), target);

    }
    static String skipWordNotAnother(String up, String target, String nottarget){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith(target) && !up.startsWith(nottarget)){
            return skipWordNotAnother(up.substring(target.length()), target, nottarget);
        }
        return up.charAt(0) + skipWordNotAnother(up.substring(1), target, nottarget);

    }

    static ArrayList<String> subset(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }
        ArrayList<String> left = new ArrayList<>();
        left = subset(p + up.charAt(0), up.substring(1));
        ArrayList<String> right = new ArrayList<>();
        right = subset(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
