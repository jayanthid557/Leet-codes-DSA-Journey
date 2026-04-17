import java.util.*;
class main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter the number: ");
            a[i] = s.nextInt();
        }
        
        System.out.print("Enter the number to be found: ");
        int k = s.nextInt();
        
        for(int i = 0; i<n; i++){
            if(a[i] == k){
                System.out.print(i);
                break;
            }
        }
    }
}