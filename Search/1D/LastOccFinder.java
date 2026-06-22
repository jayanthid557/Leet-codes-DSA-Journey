public class LastOccFinder{
    public static void main(String[] args){
        int[] a = {3,4,13,13,13,20,40};
        int x = 60;

        System.out.println(lo(a,x));
    }

    static int lo(int[] a, int x){
        int l = 0;
        int h = a.length-1;
        int ans = -1;
        
        while(l<=h){
            int mid = (l+h)/2;

            if(a[mid] == x){
                ans = mid;
                l = mid+1;
            }
            else if(a[mid] < x){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }

        return ans;
    }
}
