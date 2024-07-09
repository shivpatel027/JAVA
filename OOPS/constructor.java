package OOPS;

public class constructor {
    public static void main(String[] args) {
        Student student = new Student();
        Student s2 = new Student("Shiv");
        Student s3 = new Student(123);
    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Constructor is called......");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}
