package dailybasis;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(i != correct){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
