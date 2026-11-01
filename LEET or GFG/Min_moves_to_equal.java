import java.util.*;
class Min_moves_to_equal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            System.out.println("Enter the number: ");
            arr[i] = sc.nextInt();
        }

        System.out.println(minMoves(arr));
    }

    static int minMoves(int[] nums) {
        int min = nums[0];

        for(int i = 0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }

        int req = 0;

        for(int i = 0; i<nums.length; i++){
            req += nums[i] - min;
        }

        return Math.abs(req);
    }
}