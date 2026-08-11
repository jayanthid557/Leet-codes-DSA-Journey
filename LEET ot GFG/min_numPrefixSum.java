import java.util.*;
public class min_numPrefixSum {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 12, 14, 13};
        int[] res = LongestPrefix(nums);

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int sum = 0;
        for (int n : res) {
            sum += n;
        }

        while (set.contains(sum)) {
            sum++;
        }

        System.out.print(sum);
    }

    static int[] LongestPrefix(int[] a) {
        if (a == null || a.length == 0) {
            return new int[0];
        }

        int idx = 1;
        while (idx < a.length && a[idx] == a[idx - 1] + 1) {
            idx++;
        }

        int[] ans = new int[idx];
        System.arraycopy(a, 0, ans, 0, idx);
        return ans;
    }
}
