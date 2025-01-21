package practice;


import java.lang.reflect.Array;
import java.util.*;
public class Practice{
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,6};
        for(int i = 0; i < arr.length; i++){
            int lastIndex = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, lastIndex, maxIndex);
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int maxIndex = 0;
        for(int i = start; i <= end; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

    
