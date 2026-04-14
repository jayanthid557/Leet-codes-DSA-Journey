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
        int[] d = new int[n];
        d[a.length-1] = a[0];
        for(int i = 1; i<a.length;i++){
            d[i-1] = a[i]; 
        }
        
        for(int i = 0; i<a.length; i++){
            System.out.print(d[i]);
        }
    }
}