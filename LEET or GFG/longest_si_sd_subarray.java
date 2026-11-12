import java.util.*;

class longest_si_sd_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value: ");
            a[i] = sc.nextInt();
        }
        
        System.out.println(solve(a));
        sc.close();
    }

    static int solve(int[] a) {
        if (a.length == 0) return 0;
        int si = sI(a);
        int sd = sD(a);
        return Math.max(si, sd);
    }

    static int sI(int[] a) {
        int i = 0;
        int max = 1;
        for (int j = 1; j < a.length; j++) {
            if (a[j] <= a[j - 1]) {
                i = j;
            }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }

    static int sD(int[] a) {
        int i = 0;
        int max = 1;
        for (int j = 1; j < a.length; j++) {
            if (a[j] >= a[j - 1]) {
                i = j;
            }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}
