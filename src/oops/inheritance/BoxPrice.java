package oops.inheritance;
//Hierarchical with boxweight class
public class BoxPrice extends Box{
    double price;
    BoxPrice(){
        this.price = 0.0;
    }
    BoxPrice(double price){
        this.price = price;
    }
    BoxPrice(double l, double h, double w, double price){

        super(l, h, w);
        this.price = price;
    }
    BoxPrice(BoxPrice old){
        super(old);
        this.price = old.price;
    }


}
