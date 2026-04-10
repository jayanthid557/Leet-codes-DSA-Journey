import java.util.*;
class main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = s.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i<n; i++){
            System.out.println("Enter the number: ");
            a[i] = s.nextInt();
        }
        
        
        for(int i = 1; i<n; i++){
            int k = a[i];
            int j = i-1;
           while (j >= 0 && a[j] > k){
                a[j+1] = a[j];
                j--;
                a[j+1] = k;
            }
        }
        
        for(int i = 0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}