package functionMethods;
import java.util.*;

public class sum {
    public static int sum(int x, int y) { // there are parameterts
        int a = x + y;
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = sum(x,y);// these are the arguments.

        System.out.println(ans);

    }
}
