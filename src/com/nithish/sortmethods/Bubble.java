package com.nithish.sortmethods;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {0,-32,-31,-25,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        // Run the outer loop for N-1 times, [1, 2, 3, 4, 5] 0th index already in sorted order that's why n-1
        for (int i = 0; i < arr.length - 1; i++) {
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
