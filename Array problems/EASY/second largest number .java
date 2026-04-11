import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = s.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            a[i] = s.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        System.out.println(a[n - 2]);
    }
}
