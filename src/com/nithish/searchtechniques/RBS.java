package com.nithish.searchtechniques;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Arrays;
import java.util.List;
//import com.google.common.primitives.Ints;

public class RBS {
    public static void main(String[] args){
        int[] arr = {0,1,2};
//        System.out.println(search(arr, 6));

        System.out.println(findpivot(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1}));
        List<Integer> list = Arrays.asList(3,2,4,5,6);
//        int[] primitive = Ints.toArray(ints);
    }
    static public int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot -1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);

    }
    static int binarySearch(int[] arr, int target, int start, int end) {
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
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

}
