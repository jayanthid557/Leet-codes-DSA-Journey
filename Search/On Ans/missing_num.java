import java.util.*;
public class missing_num {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] a = {4,7,9,10};
        System.out.println("Enter the number: ");
        int k = s.nextInt();

        System.out.println(Sol(a,k));
        s.close();
    }

    static int Sol(int[] a, int k){
        int l = 0;
        int h = a.length-1;
        while (l<=h) {
            int mid = (l+h)/2;
            int miss = a[mid] - (mid+1);

            if(miss < k){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }

        return l+k;
    }
}
