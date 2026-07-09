import java.util.*;
public class CargoMin{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        System.out.println("Enter the min days: ");
        int d = s.nextInt();

        int h = 0;
        int max = a[0];
        
        for(int i = 0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }

            h += a[i];
        }

        int l = max ;
        int ans = h;

        while(l<=h){
            int mid = (l+h)/2;
            int curr = 0;
            int daycur = 1;

            for(int i:a){
                if(curr + i > mid){
                daycur++;
                curr = i;
                }
                else{
                    curr += i;
                }
            }

            if(daycur <= d){
                ans = mid;
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }

        System.out.println(ans);

        s.close();
    }
}
