import java.util.*;
class main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int t = 1;
        
        while(n>0){
            System.out.println(t);
            t++;
            n--;
        }
        
        System.out.print("Enter the number: ");
        int x = s.nextInt();
        int y = x;
        
        while(y>0){
            System.out.println(x);
            x--;
            y--;
        }
    }
}