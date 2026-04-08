import java.util.*;

class main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();
        
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter the number: ");;
            a[i] = s.nextInt();
        }
        
        System.out.println("Enter the number considered: ");
        int x = s.nextInt();
        int cnt = 0;
        
        for(int i = 0; i<n; i++){
            if(a[i] == x){
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}