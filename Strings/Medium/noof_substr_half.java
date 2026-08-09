import java.util.*;
public class noof_substr_half{
    public static void main(String[] args){
        String s = "pqpqs";
        int k = 2;
        int count = 0;
        
        for(int i = 0; i<s.length(); i++){
            int j = 0;
            int temp = k;
            while(temp>0){
                if(Poss(s,j,temp)){
                    count++;
                }
                temp--;
            }
        }
        System.out.print(count);
    }
    
    static boolean Poss(String s, int start, int k) {
        Map<Character, Integer> charCounts = new HashMap<>();

        for (int j = start; j < s.length(); j++) {
            char ch = s.charAt(j);
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);

            if (charCounts.size() >= k) {
                return true;
            }
        }
        return false;
    }
}
