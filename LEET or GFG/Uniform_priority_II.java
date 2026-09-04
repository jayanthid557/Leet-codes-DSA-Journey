public class Uniform_priority_II{
    public static void main(String[] args){
        int[] a = {1,2,3};
        
        System.out.println(ans(a));
    }

    static boolean ans(int[] a){
        int n = a.length;;
        int oc = 0;
        int min = a[0];
        boolean ans = false;

        for(int i = 1; i<n; i++){
            if(a[i] < min){
                min = a[i];
            }
            if(a[i] % 2 != 0){
                oc++;
            }
        }

        if(n == 1){
            ans = true;
        }

        if(min%2 == 0){
            ans = true;
        }
        
        if(oc == 0){
            ans = true;
        }
        else{
            if(min%2 == 0){
                ans = false;
            }
        }

        return ans;
    }
}
