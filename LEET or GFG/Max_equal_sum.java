import java.util.*;

public class Max_equal_sum{
    public static void main(String[] args) {
        ArrayList<Integer> s1 = new ArrayList<>(Arrays.asList(4, 2, 3));
        ArrayList<Integer> s2 = new ArrayList<>(Arrays.asList(1, 1, 2, 3));
        ArrayList<Integer> s3 = new ArrayList<>(Arrays.asList(1, 4));

        Solution sol = new Solution();
        System.out.println(sol.maxEqualSum(s1, s2, s3));
    }
}

class Solution {
    public int maxEqualSum(ArrayList<Integer> s1, ArrayList<Integer> s2, ArrayList<Integer> s3) {
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for (int x : s1) sum1 += x;
        for (int x : s2) sum2 += x;
        for (int x : s3) sum3 += x;

        int i = 0, j = 0, k = 0;

        while (i < s1.size() && j < s2.size() && k < s3.size()) {
            if (sum1 == sum2 && sum2 == sum3) {
                return sum1;
            } else if (sum1 >= sum2 && sum1 >= sum3) {
                sum1 -= s1.get(i++);
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                sum2 -= s2.get(j++);
            } else {
                sum3 -= s3.get(k++);
            }
        }
        return 0;
    }
}
