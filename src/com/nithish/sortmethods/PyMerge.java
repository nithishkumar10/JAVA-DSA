package com.nithish.sortmethods;

import java.util.Arrays;

public class PyMerge {
    public static void main(String[] args) {
        int[] list1 = {5, 4, 3, 2, 1, 1, 0, -20, -10};
        mergeSort(list1, 0, list1.length - 1);
        System.out.println(Arrays.toString(list1));
    }
    static void mergeSort(int[] list1, int s, int e){
        if( s >= e) {
            return;
        }
        int mid = (s + e) / 2;
        mergeSort(list1, s, mid);
        mergeSort(list1, mid + 1, e);
        merge(list1, s, mid, e);
    }
    static void merge(int[] list1, int s, int mid, int e){
        int[] lsl = Arrays.copyOfRange(list1, s, mid + 1);
        int[] rsl = Arrays.copyOfRange(list1, mid + 1, e + 1);
        int i = 0, j = 0, k = s;
        while(i < lsl.length && j < rsl.length){
            if(lsl[i] < rsl[j]){
                list1[k] = lsl[i];
                i++;

            }
            else {
                list1[k] = rsl[j];
                j++;
            }
            k++;
        }
        while(i < lsl.length){
            list1[k] = lsl[i];
            i++;
            k++;
        }
        while(j < rsl.length){
            list1[k] = rsl[j];
            j++;
            k++;
        }
    }
}
