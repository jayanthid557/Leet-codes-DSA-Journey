import java.util.*;

public class isomor_string {
    public static void main(String[] args) {
        String a = "paper";
        String b = "title";

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {

            if (map.containsKey(a.charAt(i))) {
                if (map.get(a.charAt(i)) != b.charAt(i)) {
                    System.out.println("Not isomorphic");
                    return;
                }
            } else {
                map.put(a.charAt(i), b.charAt(i));
            }
        }

        System.out.println("Isomorphic");
    }
}