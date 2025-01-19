package Strings.com;
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class Patterns {
    public static void main(String[] args){
       // pattern1(5);
//       pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
//        pattern9(5);
//        pattern10(5);
//        pattern11(5);
//        pattern12(5);
        pattern21(5);
    }

    static void pattern1(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int col = n; col >= row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row = 0; row < 2 * n ; row++){
            int columns = row > n ? 2 * n - row : row;
            for(int col = 0; col < columns; col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern6(int n){
        for(int row = 0; row < n; row++){
            int spaces = n - row - 1;
            for (int i = 0; i < spaces; i++){
                System.out.print(" ");
            }
            for(int col = 0; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int row = 0; row < n; row++){
            int spaces = row;
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for(int col = 0; col < n - row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int row = 1; row <= n; row++){
            int spaces = n -row;
            for(int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }
            for(int col = 0; col < 2 * row -1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for(int row = n; row > 0; row--){
            int spaces = n -row;
            for(int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }
            for(int col = 0; col < 2 * row -1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int row = 0; row < n; row++){
            int spaces = n - row - 1;
            for (int i = 0; i < spaces; i++){
                System.out.print(" ");
            }
            for(int col = 0; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for(int row = 0; row < n; row++){
            int spaces = row;
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for(int col = 0; col < n - row; col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for(int row = 1; row <= 2 * n ; row++){
            int spaces =(row > n) ? 2 * n - row : row -1;
            int columns =(row > n) ? row - n : n - row + 1;
            for(int i = 0; i < spaces; i++){
                System.out.print(" ");
            }
            for(int col = 1; col <= columns; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern21(int n){
        int number = 1;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for(int row = 0; row < 2 * n ; row++){
            int columns = row > n ? 2 * n - row : row;
            int spaces = row > n ? row - n: n - row;
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for(int col = 0; col < columns; col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
