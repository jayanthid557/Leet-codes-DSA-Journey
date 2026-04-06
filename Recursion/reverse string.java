import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String n = s.nextLine();
        
        String r = new StringBuilder(n).reverse().toString();
        
        System.out.println(r);
    }
}