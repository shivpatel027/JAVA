public class loops {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            System.out.println("Hello World " + i);
        }

        int i = 0;
        while(i < 3) {
            System.out.println("Hello World " + i);
            i++;
        }

        int j = 0;
        do {
            System.out.println("Hello World " + j);
            j++;
        } while(j < 3);
    }    
}
