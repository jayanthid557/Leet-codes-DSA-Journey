import java.util.*;
class Dupli_within_k{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++){
            System.out.println("Enter the array: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int k = sc.nextInt();

        System.out.println(solve(a,k));
    }


    static boolean solve(int[] a, int k){
        Set<Integer> s = new HashSet<>();

        for(int i = 0; i<a.length; i++){
            if(s.contains(a[i])){
                return true;
            }
            s.add(a[i]);


            if(s.size() > k){
                s.remove(a[i-k]);
            }
        }

        return false;
    }
}