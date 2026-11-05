import java.util.*;
class Xor_subarrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter thr number: ");
            arr[i] = sc.nextInt();  
        }

        System.out.println(solve(arr));
    }

    static int solve(int[] a){
        if(a.length % 2 == 0){
            return 0;
        }

        int ans = 0;
        for(int i = 0; i<a.length; i = i+2){
            ans = ans^a[i];
        }

        return ans;
    }
}