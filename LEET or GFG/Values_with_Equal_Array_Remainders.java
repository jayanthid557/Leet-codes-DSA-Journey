import java.util.*;

public class Values_with_Equal_Array_Remainders{
    public static void main(String[] args) {
        int[] test1 = {5};
        System.out.println("Output for {5}: " + solve(test1)); 
    }

    static int solve(int[] arr) {
        if (arr.length <= 1) {
            return -1;
        }

        int diffGcd = 0;
        for (int i = 1; i < arr.length; i++) {
            diffGcd = findGCD(diffGcd, Math.abs(arr[i] - arr[0]));
        }

        if (diffGcd == 0) {
            return -1;
        }

        int ans = 0;
        for (int i = 1; i * i <= diffGcd; i++) {
            if (diffGcd % i == 0) {
                ans++;
                if (i * i != diffGcd) {
                    ans++;
                }
            }
        }

        return ans;
    }

    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
