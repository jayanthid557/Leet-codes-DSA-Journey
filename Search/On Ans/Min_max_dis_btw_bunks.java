import java.util.*;
public class Min_max_dis_btw_bunks{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        System.out.println("Enter the number: ");
        int k = s.nextInt();
        
        System.out.println(sol(a,k));
        s.close();
    }

    static double sol(int[] a, int k){
        double l = 0;
        double h = 0;
        for(int i = 1; i<a.length; i++){
            h = Math.max(h, (a[i] - a[i-1]));
        }

        while(h-l  > 1e-6){
            double mid = (l+h)/2.0;
            int pos = ps(a,mid);

            if(pos > k){
                l = mid;
            }
            else{
                h = mid;
            }
        }

        return h;
    }

    static int ps(int[] a, double mid){
        int count = 0;

        for(int i = 1; i<a.length; i++){
            int inbtw = (int)((a[i] - a[i-1])/mid);

            if(a[i] - a[i-1] == mid * inbtw){
                inbtw--;
            }
            count += inbtw;
        }
        return count ;
    }
}
