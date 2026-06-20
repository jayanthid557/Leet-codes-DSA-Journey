class LowerBoundFinder{
    static int lowerbound(int[] a, int x){
        int low = 0;
        int high = a.length - 1;
        int ans = a.length;

        while(low <= high){
            int mid = (low + high)/2;

            if(a[mid] >= x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;
    }


    public static void main(String[] args){
        int[] a = {1,2,2,3};
        int x = 2;

        System.out.println(lowerbound(a,x));
    }
}