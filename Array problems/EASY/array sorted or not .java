import java.util.*;
class main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int[] a = new int[n];
        
        for(int i =0; i<n; i++){
            System.out.println("Enter the number: ");
            a[i] = s.nextInt();
        }
        
        for(int i = 0; i<a.length; i++){
            for(int j = i+1; j<a.length; j++){
                if(a[i] > a[j]){
                    System.out.println("Array is not sorted.");
                    break;
                }
            }
        }
        
        System.out.println("Array is not sorted");
    }
}