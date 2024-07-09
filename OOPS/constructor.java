package OOPS;

public class constructor {
    public static void main(String[] args) {
        Student student = new Student();

    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Constructor is called......");
    }
}
