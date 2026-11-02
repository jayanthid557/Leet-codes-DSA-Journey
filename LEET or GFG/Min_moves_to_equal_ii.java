import java.util.*;
public class Min_moves_to_equal_ii{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println(solve(arr));
    }

    static int solve(int[] nums){
         Arrays.sort(nums);

        int median = nums[nums.length/2];
        int req = 0;

        for(int i = 0; i<nums.length; i++){
            req += Math.abs(nums[i] - median);
        }

        return req;
    }
}
