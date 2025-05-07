package oops.packageexample.staticexample;

public class Main {
    public static void main(String[] args) {
        greeting();
    }
    static void greeting(){
        System.out.println("In static function");
        Main obj = new Main();
        obj.fun();
    }
    void fun(){
        System.out.println("In non static function");
        fun2();
    }
    void fun2(){
        System.out.println("In non static function");
    }
}
