public class main{
    public static void main(String[] args){
        String s = "1234";
        long k = 533;

        if(Cond(s,k)){
            System.out.println(s);
        }
    }

    static boolean Cond(String s, long k){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                return false;
            }
        }
        int a = Integer.parseInt(s);
        int j = a;
        while(j >= a+1){
            if(Pro(j) % k == 0){
                return true;
            }
        }
        return false;
    }

    static int Pro(int n){
        int d = 0;
        int ans = 1;
        while(n > 0){
            d = n%10;
            ans = ans*d;
            n = n/10;
        }
        return ans;
    }
}