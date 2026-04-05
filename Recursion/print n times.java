import java.util.*;
class main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        
        int t = n;
        while(t>0){
            System.out.println("Recursion");
            t--;
        }
    }
}