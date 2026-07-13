import java.util.Scanner;

public class Max_poss_min_time {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a[] = {10,20,30,40};
        System.out.println("Enter the number: ");
        int k = s.nextInt();
        
        if(k > a.length){
            System.out.println(-1);
        }
        else{
            System.out.println(sol(a,k));
        }


        s.close();
    }    

    static int sol(int[] a, int k){
        int l = 0;
        int h = 0;
        int ans = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] > l){
                l = a[i];
            }
            h += a[i];
        }

        while(l<=h){
            int mid = (l+h)/2;
            int poss = ps(a,mid);

            if(poss <= k){
                ans = mid;
                h = mid-1;
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

