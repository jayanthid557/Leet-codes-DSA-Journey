public class PeakNumber {
    public static void main(String[] args) {
        int[] a = {5,4,3,4,5};
        
        System.out.println(lf(a));
    }

    static int lf(int[] a){
        int n = a.length;
        if(a[0] >= a[1]){
            return 0;
        }
        if(a[n-1] >= a[n-2]){
            return n-1;
        }

        int l = 1;
        int h = n-2;

        while (l<=h) {
            int mid = (l+h)/2;

            if(a[mid] > a[mid+1] && a[mid] > a[mid-1]){
                return mid;
            }
            else if(a[mid] < a[mid+1]){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }

        return -1;
    }
}
