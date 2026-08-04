import java.util.*;

class Roman_numericals{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the roman number (in capitals): ");
        String s1 = s.nextLine();
        int[] as = new int[s1.length()];

        for (int i = 0; i < s1.length(); i++) {
            int n = 0;
            if (s1.charAt(i) == 'M') {
                n = 1000;
            } else if (s1.charAt(i) == 'D') {
                n = 500;
            } else if (s1.charAt(i) == 'C') {
                n = 100;
            } else if (s1.charAt(i) == 'L') {
                n = 50;
            } else if (s1.charAt(i) == 'X') {
                n = 10;
            } else if (s1.charAt(i) == 'V') {
                n = 5;
            } else if (s1.charAt(i) == 'I') {
                n = 1;
            } else {
                System.out.println("Invalid character: " + s1.charAt(i));
                return;
            }
            as[i] = n;
            System.out.print(as[i] + " ");
        }

        int total = 0;
        for (int i = 0; i < as.length; i++) {
            if (i + 1 < as.length && as[i] < as[i + 1]) {
                total -= as[i];
            } else {
                total += as[i];
            }
        }

        System.out.println("\n" + total);
        s.close();
    }
}