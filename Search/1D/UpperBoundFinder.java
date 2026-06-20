class UpperBoundFinder{
    public static void main(String[] args){
        int[] a = {3,5,8,9,15,19};
        int x = 9;

        System.out.println(UpperBound(a,x));
    }

    static int UpperBound(int[] a, int x){
        int l = 0;
        int h = a.length-1;
        int ans = a.length;

        while(l < h){
            int mid = (l+h)/2;

            if(a[mid] > x){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
}