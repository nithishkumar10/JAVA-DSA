package oops.customarraylist;

public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for(int i = 1; i < 20; i++){
            list.add(i);
        }
        for(int j = 0; j < 10;j++){
           int remove = list.remove();
            System.out.println(remove);
        }
        System.out.println(list);
    }
}
