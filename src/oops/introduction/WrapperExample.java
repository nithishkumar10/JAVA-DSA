package oops.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        final Integer a = 10;
//        Integer b = 20;
//        final int a1 = 10;
//        a1 = 20;
//        a = 50;

//        swap(a, b);
//        System.out.println(a + " " + b);


        A obj = new A("Nithish");
//        for(int i = 1; i < 100000000; i++){
//            obj = new A("Nithish");
//        }
        System.out.println(obj);
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A{
    final int num = 1;
    String name;

    A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object removed");
    }
}
