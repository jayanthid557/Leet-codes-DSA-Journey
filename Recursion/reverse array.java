import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int a[] = new int[n];
        
        for(int i = 0 ; i<n; i++){
            System.out.println("Enter number: ");
            a[i] = s.nextInt();
        }
        
        int r[] = new int[n];
        for(int i = 0; i<n; i++){
            r[i] = a[n-i-1];
        }
        
        for(int i = 0; i<n; i++){
            System.out.print(r[i] + " ");
        }
    }
}