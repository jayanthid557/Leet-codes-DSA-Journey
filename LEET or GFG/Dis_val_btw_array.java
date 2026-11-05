import java.util.*;
class Dis_val_btw_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int m = sc.nextInt();
        int[] arr1 = new int[m];

        for(int i = 0; i<m; i++){
            System.out.println("Enter the value: ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];

        for(int i = 0; i<n; i++){
            System.out.println("Enter the value: ");
            arr2[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int k = sc.nextInt();

        System.out.println(solve(arr1,arr2,k));
    }

    static int solve(int[] arr1, int[] arr2, int d){
        int count = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            boolean isValid = true;
            
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    isValid = false;
                    break; 
                }
            }
            
            
            if (isValid) {
                count++;
            }
        }
        
        return count;
    }
    
}