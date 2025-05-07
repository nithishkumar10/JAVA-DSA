package oops.polymorphism;

public class Child extends Parent {
    @Override
     void display() {
        System.out.println("I am in Child class");
    }

    private void privatemethod() {
        System.out.println("I am child class private method");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.privatemethod();
        obj.finalmethod();

    }
}
