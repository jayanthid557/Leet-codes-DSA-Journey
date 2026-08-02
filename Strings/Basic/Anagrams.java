import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String s1 = s.nextLine();

        System.out.println("Enter the second string: ");
        String s2 = s.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (m1.containsKey(ch)) {
                m1.put(ch, m1.get(ch) + 1);
            } else {
                m1.put(ch, 1);
            }
        }

        
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            if (m2.containsKey(ch)) {
                m2.put(ch, m2.get(ch) + 1);
            } else {
                m2.put(ch, 1);
            }
        }

        System.out.println(m1.equals(m2));
    }
}