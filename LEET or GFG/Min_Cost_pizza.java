import java.util.*;
class Min_Cost_pizza{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the small pizza dimensions: ");
        int s = sc.nextInt();
        System.out.println("Enter the medium pizza dimensions: ");
        int m = sc.nextInt();
        System.out.println("Enter the large pizza dimensions: ");
        int l = sc.nextInt();

        System.out.println("Enter the small pizza price: ");
        int cs = sc.nextInt();
        System.out.println("Enter the medium pizza price: ");
        int cm = sc.nextInt();
        System.out.println("Enter the large pizza price: ");
        int cl = sc.nextInt();

        System.out.println("Enter required dimensions: ");
        int x = sc.nextInt();

        System.out.println(solve(x,s,m,l,cs,cm,cl));
        sc.close();
    }

    static int solve(int x, int s, int m, int l, int cs, int cm, int cl){
         int[] ans = new int[x + 1];
        ans[0] = 0;

        for (int i = 1; i <= x; i++) {
            int res = Integer.MAX_VALUE;

            int dcs = ans[Math.max(0, i - s)] + cs;
            int dcm = ans[Math.max(0, i - m)] + cm;
            int dcl = ans[Math.max(0, i - l)] + cl;

            res = Math.min(res, dcs);
            res = Math.min(res, dcm);
            res = Math.min(res, dcl);

            ans[i] = res;
        }

        return ans[x];
    }
}