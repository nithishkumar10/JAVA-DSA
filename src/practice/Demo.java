package practice;

import com.nithish.sortmethods.Bubble;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
//        Scanner sc = new Scanner(System.in);
//        int target = sc.nextInt();
//        if(isFound(arr, target)){
//            System.out.println("Yes");
//        }else {
//            System.out.println("NO");
//        }
//        arr = mergeSort2(arr);
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
//

    static int[] mergeSort2(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort2(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort2(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while( i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k]  = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
    static void Bubble(int[] arr){
        for(int i  = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j - 1);
                }
            }
        }
    }
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, last);
            swap(arr, last, max);
        }
    }
    static int getMaxIndex(int[] arr,int last){
        int ans = 0;
        for(int i = 1; i <= last; i++){
            if(arr[ans] < arr[i]){
                ans = i;
            }
        }
        return ans;

    }
    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, correct, i);
            }else{
                i++;
            }
        }
    }
}
