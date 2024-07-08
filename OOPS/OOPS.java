package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setColor("Blue");
        System.out.println(pen.getColor());
        pen.setTip(10);
        System.out.println(pen.getTip());

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
    private String color;
    private int tip;

    String getColor()   {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
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


