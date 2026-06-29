import java.util.*;
public class Nth_root {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        System.out.println("Enter the rooth: ");
        int r = s.nextInt();

        int l = 1;
        int h = n;
        int ans = -1;

        while(l<=h){
            int m = (l+h)/2;
            int a = 1;

            for(int i = 0;i<r;i++){
                a *= m;
                if(a>n){
                    break;
                }
            }

            if(a == n){
                ans = m;
            }
            if(a<n){
                l = m+1;
            }
            else{
                h = m-1;
            }

        }


        System.out.println(ans);
        s.close();
    }
}