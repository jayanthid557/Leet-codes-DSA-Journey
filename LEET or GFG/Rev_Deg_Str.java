import java.util.*;
class Rev_Deg_Str{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        int n = s.length();
        int sum = 0;

        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            int as = 26 - (c - 'a');
            sum += (i+1)*as;
        }

        System.out.println(sum);

        sc.close();
    }
}