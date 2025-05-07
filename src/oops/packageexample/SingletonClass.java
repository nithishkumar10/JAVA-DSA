package oops.packageexample;

public class SingletonClass {
    private static SingletonClass obj;

    private SingletonClass() {

    }

    static public SingletonClass getInstance(){
        if(obj == null){
            obj = new SingletonClass();
            System.out.println("Object created");
        }
        System.out.println("referenced");
        return obj;
    }
}
