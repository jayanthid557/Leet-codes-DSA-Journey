public class FloorCelingFinder{
    public static void main(String[] args){
        int[] a = {3,4,4,7,8,10};
        int x = 8;

        System.out.println(FloorFinder(a,x));
        System.out.println(CelingFinder(a,x));
    }

    static int FloorFinder(int[] a, int x){
        int l = 0;
        int h = a.length-1;
        int fl = -1;

       while(l <= h){
            int mid = (l+h)/2;

            if(a[mid] <= x){
                fl = mid;
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }

        return a[fl];
    }

    static int CelingFinder(int[] a, int x){
        int l = 0;
        int h = a.length-1;
        int ce = -1;

        while(l<=h){
            int mid = (l+h)/2;

            if(a[mid] >= x){
                ce = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return a[ce];
    }
}
