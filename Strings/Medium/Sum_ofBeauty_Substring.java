import java.util.*;

public class Sum_ofBeauty_Substring{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s.nextLine();
        
        int count = iterateAndSum(str); 
        System.out.println("Total Difference: " + count);
    }

    static int iterateAndSum(String str) {
        if (str == null) return 0;
        
        int length = str.length();
        int totalDiff = 0;
        
        for (int i = 0; i < length; i++) {
            Map<Character, Integer> counts = new HashMap<>();
            
            for (int j = i; j < length; j++) {
                char c = str.charAt(j);
                counts.put(c, counts.getOrDefault(c, 0) + 1);
                
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int freq : counts.values()) {
                    if (freq > max) max = freq;
                    if (freq < min) min = freq;
                }
                
                totalDiff += (max - min);
            }
        }
        return totalDiff;
    }
}
