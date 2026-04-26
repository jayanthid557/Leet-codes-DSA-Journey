import java.util.*;

class Main {
    public static void nextPermutation(int[] a) {
        int i = a.length - 2;

        while (i >= 0 && a[i] >= a[i + 1]) i--;

        if (i >= 0) {
            int j = a.length - 1;
            while (a[j] <= a[i]) j--;
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }

        reverse(a, i + 1, a.length - 1);
    }

    static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int t = a[l];
            a[l++] = a[r];
            a[r--] = t;
        }
    }

    public static void main(String[] args) {
        int[] a = {3,2,1};
        nextPermutation(a);
        for (int x : a) System.out.print(x + " ");
    }
}