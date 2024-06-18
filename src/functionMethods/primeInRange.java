package functionMethods;

public class primeInRange {
    public static boolean prime(int n) {
        boolean isprime = true;
        if(n%2 == 0) {
            isprime = false;
        }
        return isprime;
    }
    
    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(prime(i)) {
                System.out.print(i + ", ");
            }
        }
    }
    public static void main(String[] args) {
        primesInRange(10);
    }
}
