package com.nithish.sortmethods;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3,7,8,6,1,5,4,12,5};
       recursiveBubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void recursiveBubbleSort(int[] arr, int n){
        if(n == 1){
            return;
        }
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                swap(arr, i, i + 1);
            }
        }
        recursiveBubbleSort(arr, n - 1);
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void bubble(int[] arr){
        boolean swapped;
        // Run the outer loop for N-1 times, [1, 2, 3, 4, 5] 0th index already in sorted order that's why n-1
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // Run the inner loop from 1 to N-i-1 times, Because last respective index
            // is sorted for I time
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //If inner loop does not swap any item, it means arr is already is sorted!!!
            if(!swapped){
                break;
            }
        }
    }
}
