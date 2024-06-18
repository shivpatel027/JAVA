package functionMethods;

public class primeOrNot {
    public static boolean prime(int n) {
        boolean isprime = true;
        if(n%2 == 0) {
            isprime = false;
        }
        return isprime;
    }

    public static boolean isPrime(int n) {
        if( n == 2 ) {
            return true;
        }
        for(int i = 2; i< Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(prime(4));
    }
}
