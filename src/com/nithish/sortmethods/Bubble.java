package com.nithish.sortmethods;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {345, 12, 789, 654, 321, 876, 90, 456, 234, 678,
                543, 98, 123, 765, 987, 210, 432, 876, 678, 567,
                134, 687, 992, 102, 582, 394, 675, 821, 301, 299,
                900, 458, 237, 684, 999, 333, 121, 485, 269, 705,
                604, 808, 222, 131, 745, 382, 617, 952, 406, 738,
                159, 753, 951, 852, 369, 258, 147, 753, 846, 951,
                357, 159, 649, 852, 463, 284, 731, 482, 937, 728,
                516, 208, 815, 639, 427, 204, 906, 308, 517, 823,
                625, 904, 512, 703, 106, 987, 405, 294, 713, 872,
                569, 487, 369, 258, 147, 365, 741, 852, 963, 951,
                753, 357, 852, 147, 951, 753, 741, 258, 159, 369,
                689, 345, 567, 908, 231, 754, 962, 435, 817, 623,
                501, 409, 826, 741, 519, 802, 625, 314, 729, 617,
                823, 108, 901, 245, 867, 543, 219, 678, 432, 987,
                504, 312, 785, 643, 927, 831, 267, 804, 513, 709,
                368, 952, 741, 159, 643, 876, 502, 357, 654, 201,
                789, 936, 702, 483, 951, 246, 395, 608, 473, 591,
                287, 649, 825, 307, 458, 671, 539, 218, 756, 634,
                891, 476, 502, 317, 619, 458, 783, 690, 562, 803};
       bubble(arr);
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
