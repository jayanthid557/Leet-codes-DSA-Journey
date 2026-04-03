//In this code we are trying to find the number of digits are there in a Number.


import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        
        int count = 0;
        while(n!=0){
            count++;
            n = n/10;
        }
        
        System.out.println(count);
    }
}