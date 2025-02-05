package dailybasis;

import java.util.Arrays;

public class Practice {
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
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    public static String largestOddNumber(String num) {
//        StringBuilder str = new
        String ans = "";
        for(int i = num.length() - 1; i >=0; i--){
            if(num.charAt(i) % 2 != 0){
                ans = num.substring(0, i + 1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while( i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k]  = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }


}

