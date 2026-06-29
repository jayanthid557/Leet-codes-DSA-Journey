public class Banana_Pile{
    public static void main(String[] args){
        int[] a = {3,6,7,11};
        int n = a.length;
        int x = 0;
        int th = 8;

        int l = 0;
        int h = a[0];
        for(int i = 0; i<n; i++){
            if(a[i] > h){
                h = a[i];
            }
        }

        while(l <= h){
            int m = (l+h)/2;
            long s = 0;

            for(int i = 0; i<n; i++){
                s += (a[i] + m - 1)/m ;
            }

            if(s <= th){
                x = m;
                h = m-1;
            }
            else{
                l = m+1;
            }
        }

        System.out.println(x);
    }
}
