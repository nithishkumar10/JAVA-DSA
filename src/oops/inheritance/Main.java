package oops.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box b1 = new Box(4,5 ,6);
//        System.out.println(b1.l);
//        System.out.println(b1.h);
//        System.out.println(b1.w);
//        Box b2 = new Box(b1);
//        System.out.println();
//        System.out.println(b2.l);
//        System.out.println(b2.h);
//        System.out.println(b2.w);
//        BoxWeight b1 = new BoxWeight(1,2,3,4);
//        System.out.println(b1.l);
//        System.out.println(b1.h);
//        System.out.println(b1.w);
//        System.out.println(b1.weight);
//        Box b2 = new BoxWeight(b1);
//        System.out.println(b2.l);
//        System.out.println(b2.h);
//        System.out.println(b2.w);
//        System.out.println(b2);
        BoxColor b1 = new BoxColor(1,2,3,4,"Bulugu");
        System.out.println(b1.l);
        System.out.println(b1.h);
        System.out.println(b1.w);
        System.out.println(b1.weight);
        System.out.println(b1.color);
        BoxColor b2 = new BoxColor(b1);
        System.out.println(b2.l);
        System.out.println(b2.h);
        System.out.println(b2.w);
        System.out.println(b2.weight);
        System.out.println(b2.color);
        BoxPrice b3 = new BoxPrice(1,2,3,89);
        System.out.println(b3.l);
        System.out.println(b3.h);
        System.out.println(b3.w);
        System.out.println(b3.price);
        BoxPrice b4 = new BoxPrice(b3);

    }

}
