import java.util.*;
class Max_subarr_with_two_rep{
    public static void main(String[] args){
        String s = "bcbbbcba";
        int max = 0;
        int l = 0;
        Map<Integer, Integer> m = new HashMap<>();

        for(int r= 0; r<s.length(); r++){
            int val = s.charAt(r);

            m.put(val, m.getOrDefault(val, 0) + 1);
            
            while(m.get(val) > 2){
                int lef = s.charAt(l);
                m.put(lef, m.getOrDefault(lef, 0) - 1);
                l++;
            }

            max = Math.max(max, r-l+1);
        }

        System.out.print(max);
    }
}
