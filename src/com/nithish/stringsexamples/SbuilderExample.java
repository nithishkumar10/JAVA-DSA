package Strings.com;

public class SbuilderExample {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Hey ");
//        sb.append("Hello");
//        System.out.println(sb);
//        System.out.println(sb.deleteCharAt(0));
//        System.out.println(sb.insert(0, 'H'));
//        System.out.println(sb.indexOf("H"));
        StringBuilder str = new StringBuilder("");
        char ans;
        for (int i = 0; i < 26; i++) {
            ans = (char)('a' + i);
            str.append(ans);
        }
        System.out.println(str.reverse());
    }


}
