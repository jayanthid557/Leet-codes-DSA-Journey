import java.util.*;
class main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        
        int f0 = 0;
        int f1 = 1;
        
        for(int i = 1; i<n-1; i++){
            int next = f0+f1;
            System.out.println(next);
            f0 = f1;
            f1 = next;
        }
    }
}