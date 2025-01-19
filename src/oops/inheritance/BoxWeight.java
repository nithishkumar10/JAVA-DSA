package oops.inheritance;
// Hierarchical with box
public class BoxWeight extends Box {
    double weight;
    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double weight){
        this.weight = weight;
    }

    BoxWeight(double l, double h, double w, double weight){
        super(l, h, w);
        this.weight = weight;
    }

    BoxWeight(BoxWeight old){
        super(old);
        this.weight = old.weight;
    }



}
