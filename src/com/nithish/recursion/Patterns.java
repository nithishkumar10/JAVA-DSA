package com.nithish.recursion;

import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
//        triangle2(4, 0);
        int[] arr= {4,3,25,33,1};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void triangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("* ");
            triangle(r, c + 1);
        }
        else{
            System.out.println();
            triangle(r - 1, 0);
        }
    }
    static void triangle2(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            triangle2(r, c + 1);
            System.out.print("* ");
        }
        else{
            triangle2(r - 1, 0);
            System.out.println();
        }
    }
    static void bubble(int[] arr,int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c + 1]){
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, r, c + 1);
        }
        else{
//            System.out.println();
            bubble(arr,r - 1, 0);
        }
    }
    static void selection(int[] arr, int r, int c, int maxIndex){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[maxIndex]){
                selection(arr, r, c+1, c);
            }else {
                selection(arr, r, c + 1, maxIndex);
            }

        }
        else{
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r -1, 0, 0);

        }
    }
}

