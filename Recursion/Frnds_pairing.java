import java.util.*;
public class Frnds_pairing{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(f(n));
    }
    
   static int f(int n) {
    if (n <= 2) return n;

    int prev2 = 1; // f(1)
    int prev1 = 2; // f(2)
    int ans = 0;

    for (int i = 3; i <= n; i++) {
        ans = prev1 + (i - 1) * prev2;
        prev2 = prev1;
        prev1 = ans;
    }
    return ans;
}
}
