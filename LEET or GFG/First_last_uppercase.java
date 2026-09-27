import java.util.Scanner;
public class First_last_uppercase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String;: ");
        String s = sc.nextLine();

        solve(s);
        sc.close();
    }

    static String solve(String s){
        char[] ch = s.toCharArray();
       int n = ch.length;

       ch[0] = Character.toUpperCase(ch[0]);
       ch[n-1] = Character.toUpperCase(ch[n-1]);
       for(int i = 1; i<n-1; i++){
        if(ch[i] == ' '){
            ch[i-1] = Character.toUpperCase(ch[i-1]);
            ch[i+1] = Character.toUpperCase(ch[i+1]);
        }
       }

       String res = new String(ch);

       return res;
    }
}
