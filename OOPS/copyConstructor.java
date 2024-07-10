package OOPS;

public class copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shiv";
        s1.roll = 54;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int[] marks;

    // Default constructor
    Student() {
        marks = new int[3]; // Initialize the marks array
        System.out.println("Constructor is called...");
    }

    // Shallow Copy constructor
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     marks = new int[3];
    //     this.marks = s1.marks;
    // }

    //Deep copy costructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        marks = new int[3];
        for(int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // Constructor with name parameter
    Student(String name) {
        this();
        this.name = name;
    }

    // Constructor with roll parameter
    Student(int roll) {
        this();
        this.roll = roll;
    }
}
 