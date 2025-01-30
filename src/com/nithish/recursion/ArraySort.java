package com.nithish.recursion;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,96};
        System.out.println(normalLoop(arr));
        System.out.println(recursiveApproach(arr, 0));
    }
    static boolean recursiveApproach(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && recursiveApproach(arr, index + 1);
    }
    static boolean normalLoop(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }
}
