package linkedlist;

public class LL {
    public Node head;
    public Node tail;
    int size;
    LL(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        if(tail == null){
            tail = node;
        }
        node.next = head;
        head = node;
        this.size++;
    }
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        this.size++;

    }
    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == this.size - 1){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        this.size++;
    }
//    public Node find(int value){
//        Node temp = head;
//        while(temp != null){
//            if(temp.value == value){
//                return temp;
//            }
//            temp = temp.next;
//        }
//        return null;
//    }
    public int find(int value){
        Node temp = head;
        for(int i = 0; i < this.size; i++){
            if(temp.value == value){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        this.size--;
        return value;
    }
    public int delele(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == this.size - 1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        this.size--;
        return value;
    }
    public int deleteLast(){
        if (this.size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(this.size - 2);
        int value = tail.value;
        tail = secondLast;
        secondLast.next = null;
        this.size--;
        return value;
    }
    public Node get(int index){
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }
    private class Node{
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }







}
