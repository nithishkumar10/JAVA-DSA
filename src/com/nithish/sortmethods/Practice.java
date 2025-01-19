package com.nithish;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.nio.channels.ScatteringByteChannel;
import java.util.Arrays;

import java.util.*;
import java.lang.*;
import java.io.*;

class Practice
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(arr));
    }
    static int[] twoSum(int[] arr, int target) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

