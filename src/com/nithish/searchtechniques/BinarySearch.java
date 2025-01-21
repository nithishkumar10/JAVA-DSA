package com.nithish.searchtechniques;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
          // For 1D Array
//        int[] arr = new int[]{1,2,3,4,5,6,8,90,900,9000};
//        int target = 900;
//        int index = binarySearch(arr, target);
//        System.out.println("The index of " + target + " is " + index);

        // For 2D Array
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {19, 26, 37, 46},
                {21, 28, 38, 49}
        };
        int[] ans = binarySearch2DArray(matrix, 25);
        System.out.println(Arrays.toString(ans));
    }

     static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int[] binarySearch2DArray(int[][] arr, int target){
        int row = 0;
        int col = arr[row].length - 1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }
            if(arr[row][col] > target){
                col--;
            }else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
