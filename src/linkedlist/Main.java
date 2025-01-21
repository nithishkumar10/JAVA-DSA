package linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(33);
        list.insertFirst(44);
        list.insertFirst(55);
        list.insertFirst(66);
        list.insertLast(22);
        list.insertLast(11);

        list.insert(50, 2);
        System.out.println(list.find(33));
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteFirst());
        System.out.println(list.size);
        list.display();
        System.out.println(list.deleteLast());
        System.out.println(list.size);
        list.display();
        System.out.println(list.deleteLast());
        System.out.println(list.size);

        list.display();
        list.insertLast(22);
        list.display();
        System.out.println(list.delele(2));
        list.display();
        System.out.println(list.size);
        System.out.println(list.delele(1));
        list.display();
        System.out.println(list.size);
        System.out.println(list.find(22));

    }

}
