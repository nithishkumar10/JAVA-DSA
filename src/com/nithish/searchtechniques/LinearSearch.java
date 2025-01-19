package searchTechniques.com;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 2,3, 8, 99,1001,0};
        boolean result = linearSearch2(arr,1001);
        System.out.println(result);
//        System.out.println(Integer.MAX_VALUE);
    }
    // Return true or false whether element is found or not
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
