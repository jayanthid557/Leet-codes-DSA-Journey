class Main {
    public static void main(String[] args) {
        int[] a = {8, 2, 4, 5, 3, 7, 1};
        int m = a.length+1;
        int sa = 0; 
        int sc = 0;
        for(int i = 1; i<m+1; i++){
            sa = sa+i;
        }
        for(int i = 0; i<a.length; i++){
            sc = sc+a[i];
        }
        System.out.println(sa);
        System.out.println(sc);
        int miss = sa-sc;
        System.out.println(miss);
    }
}