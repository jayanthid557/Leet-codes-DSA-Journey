import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = s.nextInt();
        int temp = x;
        int dig;
        int rev = 0;

        while (temp != 0) {
            dig = temp % 10;
            
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                System.out.println("0");
            }
            
            rev = rev * 10 + dig;
            temp = temp / 10;
        }

        int temp1 = rev;
        if (temp1 % 10 == 0) {
            rev = rev / 10;
        }

        System.out.println("reverse: " + rev);
        
        if(rev == x){
            System.out.println("Number is a palindrome");
        }
        else{
            System.out.println("Number is not a palindrome");
        }
    }
}