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
        
        int max = a[0];
        for(int i = 1; i<n; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        
        System.out.println(max);
    }
}