import java.util.*;
public class Bird_max_fruit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
          System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println("Enter max trees: ");
        int m = sc.nextInt();

        System.out.println(solve(a,m));
        sc.close();
    }

    static int solve(ArrayList<Integer> arr, int m){
        int n = arr.size();

        if (m >= n) {
            int totalSum = 0;
            for (int val : arr) totalSum += val;
            return totalSum;
        }

        ArrayList<Integer> concatList = new ArrayList<>(arr);
        concatList.addAll(arr);

        int currentSum = 0;
        for (int i = 0; i < m; i++) {
            currentSum += concatList.get(i);
        }

        int maxSum = currentSum;
        int limit = n + m - 1; 

        for (int i = m; i < limit; i++) {
            currentSum -= concatList.get(i - m);
            currentSum += concatList.get(i);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
