import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = s.nextInt();

        int[] a = new int[n];  

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number: ");
            a[i] = s.nextInt();
        }

        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            int c = a[i];
            boolean isDuplicate = false; 
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == c) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                d[i] = c; 
            }
        }

        System.out.println("Result:");
        for (int i = 0; i < n; i++) {
            if (d[i] != 0) {   
                System.out.println(d[i]);
            }
        }
    }
}