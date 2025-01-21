package dailybasis;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        reverse(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
        int k = 3;
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr, int k){
        for(int i = 1; i < k; i++){
            swap(arr, i, i -1);
        }
    }
    static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    static void reverse(int[] arr, int start, int end){
        while(start <= end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
