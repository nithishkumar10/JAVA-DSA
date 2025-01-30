package com.nithish.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5,5,5,5,5,6,6,6,6,6,7,7,7};
        System.out.println(searchFirst(arr, 5, 0));
        System.out.println(searchLast(arr, 5, arr.length - 1));
//        findAllIndex(arr, 5, 0);
//        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(findAll(arr, 5, 0));
    }
    static int searchFirst(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        } else if (arr[index] == target) {
            return index;
        }
        return searchFirst(arr, target, index + 1);
    }
    static int searchLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        } else if (arr[index] == target) {
            return index;
        }
        return searchLast(arr, target, index - 1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
    static ArrayList<Integer> findAll(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAll(arr, target, index + 1, list);
    }
    // Don't use this approach, because it is creating new memory for every func call
    static ArrayList<Integer> findAll(int[] arr, int target, int index){
        ArrayList<Integer> temp = new ArrayList<>();
        if(index == arr.length){
            return temp;
        }
        if(arr[index] == target){
            temp.add(index);
        }
        temp.addAll(findAll(arr, target, index + 1));
        return temp;
    }

}
