package oops.inheritance;

public class Box {
    double l;
    double h;
    double w;
    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box(Box obj){
        this.l = obj.l;
        this.h = obj.h;
        this.w = obj.w;
    }
    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public void information(){
        System.out.println("In the Box class");
    }


}
