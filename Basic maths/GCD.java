class Main {
    public static void main(String[] args) {
        int n = 4;
        int m = 7;
        int gcd = 1;
        
        for(int i = 2; i<=Math.min(n,m); i++){
            if(n%i == 0 && m%i == 0){
                gcd = i;
            }
        }
        
        System.out.println(gcd);
    }
}