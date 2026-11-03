import java.util.*;
class Min_moves_to_equal_iii{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++){
            System.out.println("Enter the number: ");
            a[i] = sc.nextInt();
        }

        System.out.println(solve(a));
    }

    static int solve(int[] nums){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += max - nums[i];
        }

        return sum;
    }
}