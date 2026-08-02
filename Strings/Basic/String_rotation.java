import java.util.*;
public class String_rotation{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s.nextLine();
        System.out.println("Enter the wanted number: ");
        String g = s.nextLine();

        if (str.length() != g.length()) {
            System.out.println(false);
            return;
        }

        String s1 = str + str;

        if(s1.contains(g)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        s.close();
    }
}
