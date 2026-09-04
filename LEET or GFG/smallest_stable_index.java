public class smallest_stable_index{
    public static void main(String[] args){
        int[] a = {0,0,0};
        int p = 0;
        System.out.println(solve(a,p));
    }
    
    static int solve(int[] a, int k){
        int idx = -1;
        for(int i = 0; i<a.length; i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int j = 0; j<=i; j++){
                if(max < a[j]){
                    max = a[j];
                }
            }
            for(int p = i; p<a.length; p++){
                if(min > a[p]){
                    min = a[p];
                }
            }

            int diff = max - min;
            if(diff <= k){
                idx = i;
                return idx;
            }
        }

        return -1;
    }
}
