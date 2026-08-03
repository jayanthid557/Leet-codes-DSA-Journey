import java.util.*;
public class sort_fre_char {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = s.nextLine();

        HashMap<Character, Integer> m1 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (m1.containsKey(ch)) {
                m1.put(ch, m1.get(ch) + 1);
            } else {
                m1.put(ch, 1);
            }
        }

        Map<Character, Integer> sortedMap = new TreeMap<>(m1);

        System.out.println(sortedMap);
    }
}
