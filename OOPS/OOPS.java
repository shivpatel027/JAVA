package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setColor("Blue");
        System.out.println(pen.color);
        pen.setTip(10);
        System.out.println(pen.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Shiv Patel";
        // myAcc.password = "abcdefg";
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
} 

class Student {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int math, int chem){
        percentage = (phy + chem + math) / 3; 

    }
}


