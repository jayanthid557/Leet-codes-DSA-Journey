import java.util.*;
class Remove_outmost_paren{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();

        System.out.println(solve(s));
        sc.close();
    }

    static String solve(String s){
         StringBuilder sb = new StringBuilder();
        int opened = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                if (opened > 0) {
                    sb.append(c);
                }
                opened++;
            } else {
                opened--;
                if (opened > 0) {
                    sb.append(c);
                }
            }
        }
        
        return sb.toString();
    }
}