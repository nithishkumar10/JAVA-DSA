package dailybasis;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String s = "Hello World";
        s = s.replaceAll(" ", "").toLowerCase();
        System.out.println(s);
        System.out.println(reverseNumber(012));
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int reverseNumber(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;
        }
        return sum;
    }

}

