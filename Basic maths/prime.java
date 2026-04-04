import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        s.close();

        if (n <= 1) {
            System.out.println("Number is neither prime nor non-prime");  
            return;
        }
        if (n == 2) {
            System.out.println("Number is prime number");
            return;
        }

        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("Number is prime number");
        } else {
            System.out.println("Number is not prime number");
        }
    }
}