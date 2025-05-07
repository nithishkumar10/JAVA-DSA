package oops.introduction;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(25, "Anudeep", 99.5f);
        s.display();
    }
}
class Student{
    int rollno;
    String name;
    float marks;

    Student() {
        this(22, "Nithish", 99.7f);
    }

    Student(int rollno, String name, float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    void display(){
        System.out.println("Roll:" + " " + this.rollno + " ");
        System.out.println("Name:" + " " + this.name + " ");
        System.out.println("Marks:" + " " + this.marks + " ");
    }
}
