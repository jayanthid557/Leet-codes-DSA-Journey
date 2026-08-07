public class Str_to_Int_half{
    public static void main(String[] args){
        String s = " n1";
        String ans = "";

    for (int i = 0; i < s.length(); i++) {
        if (isDigit(s.charAt(i))) {
            ans += s.charAt(i);
        } 
        else {
            ans = "0";
            break;
            }
        }

        System.out.print(ans);
    }

    static boolean isDigit(char s) {
        return Character.isDigit(s);
    }
}
