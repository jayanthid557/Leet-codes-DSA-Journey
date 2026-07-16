
public class median_osa{
    public static void main(String[] args){
        int[] a = {1,3,5};
        int[] b = {2,4,6};

        int n = a.length + b.length;
        int mid1 = (n-1)/2;
        int mid2 = n/2;

        int i = 0; int j = 0; int cnt = 0;
        int x = 0; int y = 0;


        while(i < a.length || j < b.length){
            int curr = 0;

            if(j == b.length || (i<a.length && a[i] <= b[j])){
                curr = a[i++];
            }
            else{
                curr = b[j++];
            }

            if(cnt == mid1) x = curr;
            if(cnt == mid2) y = curr;
            cnt++;
        }

        if(n%2 == 0){
            System.out.println((x+y)/2.0);
        }
        else{
            System.out.println(y);
        }
    }
}
