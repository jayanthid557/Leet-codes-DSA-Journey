public class  max_noof_ones_bruteforce{
    public static void main(String[] args){
        int[][] a = {
                {0,0,0},
                {1,0,1},
                {0,0,0}
            };

        int max = 0;
        int ans = -1;

        for(int i = 0; i<a.length; i++){
            int count = 0;
            for(int j = 0; j<a[0].length; j++){
                if(a[i][j] == 1){
                    count++;
                }
            }
            if(max < count){
                ans = i;
                max = Math.max(max,count);
            }
        }


        System.out.println(ans);
    }
}
