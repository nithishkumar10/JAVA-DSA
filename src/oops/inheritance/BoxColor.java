package oops.inheritance;
// Multiple with boxweight and box
public class BoxColor extends BoxWeight {
    String color;
    BoxColor(){
        this.color = "black";
    }
    BoxColor(String color){
        this.color = color;

    }
    BoxColor(double l, double h, double w, double weight, String color){
        super(l, h, w, weight);
        this.color = color;
    }
    BoxColor(BoxColor old){
        super(old);
        this.color = old.color;
    }

}
