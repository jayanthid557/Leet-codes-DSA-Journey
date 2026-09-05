public class smallest_stable_index_ii {

    static int solve(int[] a, int k) {
        int n = a.length;
        
        int[] pm = new int[n];
        int[] sm = new int[n];

        pm[0] = a[0];
        for(int i = 1; i<n; i++){
            pm[i] = Math.max(pm[i-1], a[i]);
        }

        sm[n - 1] = a[n - 1];
        for(int i = n - 2; i >= 0; i--){
            sm[i] = Math.min(sm[i + 1], a[i]);
        }

        for(int i = 0; i<n; i++){
            if(pm[i] - sm[i] <= k){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {5,0,1,4};
        int k = 3;

        System.out.println(solve(a,k));
    }
}