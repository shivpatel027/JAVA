package functionMethods;
import java.util.*;

public class swap {
    public static void swap(int i, int j) {
        System.out.println(i + "," + j);
        int temp = i;
        i = j;
        j = temp;
        System.out.println(i + "," + j);
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 5;
        int j = 10;
        swap(i, j); 
    }

}
