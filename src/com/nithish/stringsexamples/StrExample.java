package Strings.com;

import java.util.ArrayList;

public class StrExample {
    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = new String("Hello");
//        System.out.println(str1 == str2);
//        String str = "Hello";
//        str = "World";
//        System.out.println(str);
//        System.out.println('a' + 'b');
//        System.out.println('a' + 1);
//        System.out.println("a" + "b");
//        System.out.println("a" + 1);
//        System.out.println("a" + new ArrayList<>());
//        System.out.println(new ArrayList<>() +""+ new Integer(5) );
        String str = "" ;
        char ans;
        for (int i = 0; i < 26; i++) {
            ans = (char)('a' + i);
            str = str + ans;
        }
        System.out.println(str);
    }
}
