package oops.interfaces;

public class Main implements interfaceable{
    public void area() {
        System.out.println("Hello area");
    }
    public void perimeter() {
        System.out.println("hello peri");
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.perimeter();
        obj.area();
    }


}
