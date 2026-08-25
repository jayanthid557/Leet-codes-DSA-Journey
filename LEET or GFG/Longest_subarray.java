import java.util.*;
public class Longest_subarray{
    public static void main(String[] args){
        int[] a = {1,2,1,2,1};
        int k = 2;

        int r = rs(a,k);

        System.out.println(r);
    }

    static int rs(int[] a, int k){
        int l = 0;
        int max = 0;
        Map<Integer, Integer> m = new HashMap<>();

        for(int r = 0; r < a.length; r++){
            int val = a[r];
            if(m.containsKey(val)){
                m.put(val, m.get(val) + 1);
            }
            else{
                m.put(val,1);
            }

            while(m.get(val) > k){
                int lval = a[l];
                int count = m.get(lval);

                if(count == 1){
                    m.remove(lval);
                }
                else{
                    m.put(lval, count-1);
                }
                l++;
            }

            max = Math.max(max, r-l+1);
        }

        return max;
    }
}
