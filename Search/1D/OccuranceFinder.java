class OccuranceFinder{
    static int lb(int[] a, int x){
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

    static int ub(int[] a, int x){
        int l = 0;
        int h = a.length-1;
        int ans = a.length;

         while(l <= h){
            int mid = (l+h)/2;

            if(a[mid] <= x){
                ans = mid;
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }

        return ans;
    }

    public static void main(String[] args){
        int[] a = {2,2,3,3,3,3,4};
        int x = 3;

        int i = lb(a,x);
        int f = ub(a,x);

        int Occ = f-i+1;
        System.out.println(i);
        System.out.println(f);
        System.out.println(Occ);
    }
}