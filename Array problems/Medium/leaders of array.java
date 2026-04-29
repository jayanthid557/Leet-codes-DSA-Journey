class Main {
    public static void main(String[] args) {
        int[] a = {10, 22, 12, 3, 0, 6};
        int n = a.length;

        int i = 0; 
        while (i < n) {
            int j = i + 1; 
            while (j < n && a[i] > a[j]) {
                j++;
            }
            if (j == n) { 
                System.out.print(a[i] + " ");
            }
            i++;
        }
    }
}
