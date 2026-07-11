import java.util.*;
public class Max_poss_min_dis{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] a = {4,2,1,3,6};
        System.out.println("Enter no.of aggressive cows: ");
        int k = s.nextInt();
        Arrays.sort(a);

        System.out.println(sol(a,k));
        s.close();
    }

    static int sol(int[] a, int k){
        int l = 1;
        int h = a[a.length-1] - a[0];

        for(int i : a){
            if(i < l){
                l = i;
            }
            if(i > h){
                h = i;
            }
        }

        while(l<=h){
            int mid = (l+h)/2;

            int pos = poss(a,k,mid);

            if(pos >= k){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return h;
    }

    static int poss(int[] a, int k, int dis){
        int curr = 0;
        int count = 1; 
        for(int i = 1; i<a.length; i++){
            if(a[i] - a[curr] >= dis){
                count++;
                curr = 1;
            }
        }
        return count;
    }
}
