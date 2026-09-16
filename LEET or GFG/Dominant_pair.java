import java.util.*;

class Dominant_pair {
    public static int dominantPairs(int[] arr) {
        int n = arr.length;
        int ans = 0;

        int[] right = new int[n / 2];

        for (int i = n / 2; i < n; i++) {
            right[i - n / 2] = arr[i];
        }

        Arrays.sort(right);

        for (int i = 0; i < n / 2; i++) {
            int low = 0;
            int high = right.length;

            while (low < high) {
                int mid = low + (high - low) / 2;

                if ((long) arr[i] >= 5L * right[mid]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            ans += low;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 1, 2, 3};

        int result = dominantPairs(arr);

        System.out.println(result);
    }
}