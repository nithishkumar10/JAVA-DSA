package oops.packageexample.b;

import oops.packageexample.SingletonClass;
import static oops.packageexample.SingletonClass.*;

import static oops.packageexample.a.Greeting.display;

public class Main {
    public static void main(String[] args) {
//        display();


        SingletonClass s = getInstance();
        SingletonClass s1 = getInstance();
    }
}
