public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int x = 0;

        for (int i = 0; i < arr.length; i++) {
            x ^= arr[i];
        }

        System.out.println(x);
    }
}