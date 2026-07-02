// There is array with flowers blooming on ith day, so they need k flowers for 1 bouq, for m bouq min noof days ??
import java.util.*;
public class MFB{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] a = {7,7,7,13,11,12,7};
        System.out.print("Number of Bouquets: ");
        int m = s.nextInt();
        System.out.print("Enter number of roses: ");
        int k = s.nextInt();

        System.out.println(minDays(a,m,k));
        s.close();
    }

    static int minDays(int[] a, int m, int k){
        int n = a.length;
        
        if(m*k > n){
            return -1;
        }

        int l = a[0];
        int h = a[0];
         
        for(int x :a){
            l = Math.min(l,x);
            h = Math.max(h,x);
        }

        int ans = -1;

        while(l<=h){
            int mid = (l+h)/2;
            int cnt = 0;
            int bq = 0;


            for(int x : a){
                if(x<=mid){
                    cnt++;
                    if(cnt == k){
                        bq++;
                        cnt = 0;
                    }
                }
                else{
                    cnt = 0;
                }
            }

            if(bq >= m){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }

        return ans;
    } 
}
