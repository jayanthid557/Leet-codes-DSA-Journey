import java.util.*;
class main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i<n; i++){
            System.out.print("Enter the number: ");
            a[i] = s.nextInt();
        }
        
        System.out.println("Enter the number: ");
        int k = s.nextInt();
        s.nextLine(); 
        System.out.println("Enter the side: ");
        String side = s.nextLine();
        
        k = k%n;
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            if (side.equalsIgnoreCase("right")){
                d[(i + k) % n] = a[i];  
            }else{
                d[(i-k+n)%n]  = a[i];
            }
        }
        
        for(int i = 0 ; i<n; i++){
            System.out.print(d[i]);
        }
    }
}