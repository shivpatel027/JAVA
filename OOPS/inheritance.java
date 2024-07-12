package OOPS;

public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

class Animal {
    String color;
    
    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breathes");
    }
}


//Derived Class
class Fish extends Animal {
    int fins;

    void swims() {
        System.err.println("swims in water");
    }
}