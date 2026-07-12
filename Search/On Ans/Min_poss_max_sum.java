import java.util.*;
public class Min_poss_max_sum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] a = {3,5,1};
        System.out.println("Enter the number: ");
        int k = s.nextInt();

        System.out.println(sol(a,k));

        s.close();
    }

    static int sol(int[] a, int k){
        int l = 0;
        int h = 0;
        int ans = 0;

        for(int i : a){
            if(i > l){
                l = i;
            }
            h += i;
        }

        while(l <= h){
            int mid = (l+h)/2;
            int pos = ps(a,mid);

            if(pos <= k){
                h = mid-1;
                ans = mid;
            }
            else{
                l = mid+1;
            }

        }

        return ans;
    }

    static int ps(int[] a, int mid){
        int count = 1;
        int csum = 0;

        for(int i : a){
            if(csum + i <= mid){
                csum += i;
            }
            else{
                count++;
                csum = i;
            }
        }

        return count;
    }
}
