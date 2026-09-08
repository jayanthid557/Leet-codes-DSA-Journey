import java.util.*;
public class Count_commas{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();

        System.out.println(solve(n));
        s.close();
    }    

    static int solve(int n){
        if(n >= 1000){
            return n-1000+1;
        }
        else if(n >= 100000){
            return n-100000+1;
        }

        return 0;
    }
}
