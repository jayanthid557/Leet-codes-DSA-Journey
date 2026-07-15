
public class median_osa{
    public static void main(String[] args){
        int[] a1 = {1,3,5};
        int[] a2 = {2,4,6};

        int l1 = a1[0];
        int l2 = a2[0];
        int h1 = a1[a1.length-1];
        int h2 = a2[a2.length-1];

        int l = Math.max(l1,l2);
        int h = Math.max(h1,h2);

        double ans = (l+h)/2;

        System.out.println(ans);

    }
}
