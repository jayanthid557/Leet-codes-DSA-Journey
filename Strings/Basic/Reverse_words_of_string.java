import java.util.ArrayList;

public class Reverse_words_of_string {
     public static void main(String[] args) {
        String s = "  amazing   coding skills  ";

        ArrayList<String> words = new ArrayList<>();

        int i = 0;
        int n = s.length();

        while (i < n) {

            // Skip spaces
            while (i < n && s.charAt(i) == ' ')
                i++;

            if (i >= n)
                break;

            String word = "";

            // Build the word
            while (i < n && s.charAt(i) != ' ') {
                word += s.charAt(i);
                i++;
            }

            words.add(word);
        }

        StringBuilder ans = new StringBuilder();

        for (int j = words.size() - 1; j >= 0; j--) {
            ans.append(words.get(j));

            if (j != 0)
                ans.append(" ");
        }

        System.out.println(ans);
    }
}
