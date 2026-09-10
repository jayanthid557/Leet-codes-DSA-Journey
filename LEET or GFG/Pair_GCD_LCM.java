public class Pair_GCD_LCM{
    public static void main(String[] args){
        int x = 2;
        int y = 12;

        System.out.println(solve(x,y));
    }
    static int solve(int x, int y) {
        
        if(y%x != 0){
            return 0;
        }
        
        int k = y/x;
        int count = 0;
        
        for(int i = 2; i*i<=k; i++){
            if(k%i == 0){
                count++;
            }
            
            while(k%i == 0){
                k = k/i;
            }
        }
        
        if(k>1){
            count++;
        }
        
        return (int)Math.pow(2,count);
    }
}

