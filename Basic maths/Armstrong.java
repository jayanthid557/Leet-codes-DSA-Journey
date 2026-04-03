import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        
        int temp = n;
        int p = 0;
        
        while(temp != 0){
            int ld = temp % 10;
            p += Math.pow(ld, 3);
            temp = temp/10;
        }
        
        System.out.println(p);
        
        if(p == n){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not a armstrong");
        }
    }
}