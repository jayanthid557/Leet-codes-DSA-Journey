import java.util.*;
class Min_pack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++){
            System.out.println("Enter the number: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the number: ");
        int k = sc.nextInt();


        System.out.println(maxPackages(a,k));

    }
    static int maxPackages(int[] arr, int totalTime) {
        int total = 0;
       for(int i = 0; i<arr.length; i++){
           total += arr[i];
       }
       
       if(arr.length < totalTime){
           return total;
       }
       
       
       int win = 0;

       for(int i = 0; i<totalTime; i++){
           win += arr[i];
       }

       int max = win;

       for(int i = totalTime; i<arr.length; i++){
           win += arr[i] - arr[i-totalTime];
           max = Math.max(max, win);
       }


       return max;
    }
}