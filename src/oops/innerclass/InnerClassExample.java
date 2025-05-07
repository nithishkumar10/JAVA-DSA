package oops.innerclass;


public class InnerClassExample {
    static class Test{
        public String name;
//        Test(){
//        }
        Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test t = new Test("Nithish");
        Test t1 = new Test("Anudeep");
        System.out.println(t.name);
        System.out.println(t1.name);
    }
}
