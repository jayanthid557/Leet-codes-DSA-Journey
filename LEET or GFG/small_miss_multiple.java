import java.util.*;
public class small_miss_multiple{
    public static void main(String[] args){
        int[] n = {8,2,4,3,6};
        int k = 2;

        Set<Integer> s= new HashSet<>();

        for(int i = 0; i<n.length; i++){
            s.add(n[i]);
        }

        int ans = k;
        while(s.contains(ans)){
            ans = ans + k;
        }

        System.out.println(ans);
    }
}
