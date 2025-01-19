package oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.area();
        Square s2 = new Square();
        s2.area();
        Circle s3 = new Circle();
        s3.area();
        Shape s4 = new Circle();
        s4.area();
        System.out.println(s1.getCount());

    }
}
