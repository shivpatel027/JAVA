package functionMethods;

public class primeOrNot {
    public static boolean prime(int n) {
        boolean isprime = true;
        if(n%2 == 0) {
            isprime = false;
        }
        return isprime;
    }

    public static void main(String[] args) {
        System.out.println(prime(5));
    }
}
