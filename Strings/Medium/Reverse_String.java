import java.util.*;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        
        StringBuilder str = new StringBuilder();
        int endOfWord = s.length();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                str.append(s.substring(i + 1, endOfWord)).append(" ");
                endOfWord = i;
            }
        }
        
        str.append(s.substring(0, endOfWord));
        
        System.out.println(str.toString());
        sc.close();
    }
}
