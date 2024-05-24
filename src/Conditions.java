import java.util.*;

public class Conditions {
    public static void main(String args[]) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greate than a");
        }
    }
}
