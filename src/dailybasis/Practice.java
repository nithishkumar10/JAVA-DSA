package dailybasis;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String s = "Hello World";
        s = s.replaceAll(" ", "").toLowerCase();
        System.out.println(s);
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

