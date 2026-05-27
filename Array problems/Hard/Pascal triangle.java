import java.util.*;
class main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter no.of rows: ");
        int r = s.nextInt();
        
        for(int i = 0; i<r; i++){
            int val = 1;
            for(int j = 0; j<=i; j++){
                System.out.print(val + " ");
                val = val*(i-j)/(j+1);
            }
            System.ut.println();
        }
    }
}