public class SmallestDivisorThre{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int th = 8;

        if(a.length>th){
            System.out.println(-1);
        }
        else{
            System.out.println(suma(a,th));
        }
        
    }


    static int suma(int[] a, int th){
        int l = 1;
        int h = a[0];
        for(int i = 0; i<a.length; i++){
            if(a[i] > h){
                h = a[i];
            }
        }

        while(l<=h){
            int mid = (l+h)/2;
            int s = 0;

            for(int i = 0; i<a.length; i++){
                s += (int)Math.ceil((double)a[i] / mid);
            }
            if(s <= th){
                h = mid-1;
            }
            else{
                l = mid+1;
                s = 0;
            }
        }

        return l;
    }
}
