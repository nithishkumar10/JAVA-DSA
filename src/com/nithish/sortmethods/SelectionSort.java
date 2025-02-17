package com.nithish.sortmethods;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-2,-43,5, 4, 3, 2,0, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, last);
            swap(arr, maxIndex, last);

        }
    }
    static void bubble(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                        swap(arr,arr[j], arr[j+1]);
                }
            }
        }
    }
    static int getMaxIndex(int[] arr,  int last) {
        int max = 0;
        for (int i = 1; i <= last; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
