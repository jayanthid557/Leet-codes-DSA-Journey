import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = s.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements: ");
            a[i] = s.nextInt();
        }

        for (int j = 0; j < n; j++) {
            int min = j;

            for (int k = j + 1; k < a.length; k++) {
                if (a[k] < a[min]) {
                    min = k;
                }
            }

            swap(a, j, min);
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}