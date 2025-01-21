package com.nithish.searchtechniques;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
//        int[] arr = {5, 7, 1, 2,3, 8, 99,1001,0};
//        boolean result = linearSearch2(arr,1001);
//        System.out.println(result);

        // For 2D array
        int[][] arr = { {18,4,-10},
                        {45,64,96},
                        {24,-10,12}
                       };
        int target = -10;
        int[] ans = linearSearch2DArray(arr, target);
        System.out.println(Arrays.toString(ans));



    }
    // Return true or false whether element is found or not
    static int[] linearSearch2DArray(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static boolean linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int element : arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }

    //return the element value if the element is found otherwise MAX_VALUE
    static int linearSearch1(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i : arr){
            if(i == target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    // Return the index of the element if found, otherwise -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}
