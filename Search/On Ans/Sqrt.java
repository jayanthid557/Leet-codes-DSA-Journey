class Sqrt{
    public static void main(String[] args){
        int n = 25;
        int ans = 0;

        int l = 1;
        int h = n;

        while(l<=h){
            int m = (l+h)/2;

            if(m * m > n){
                h = m-1;
            }
            else{
                ans = m;
                l = m+1;
            }
        }

        System.out.println(ans);
    }
}