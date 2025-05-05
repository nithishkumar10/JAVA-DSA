package dailybasis;
import java.util.*;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args){
       String s = "abba";
       String s1 = "dog cat cat dog";
        System.out.println(check(s.split(""),s1.split("\\s") ));
    }
    static boolean check(String[] s1, String[] s2){
        if(s1.length != s2.length){
            return false;
        }
        LinkedHashSet<String> l1 = new LinkedHashSet<>();
        LinkedHashSet<String> l2 = new LinkedHashSet<>();
        for(int i = 0; i < s1.length; i++){
            l1.add(s1[i]);
            l2.add(s2[i]);
        }
        return l1.size() == l2.size();
    }

}

