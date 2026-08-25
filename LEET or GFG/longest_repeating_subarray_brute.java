public class longest_repeating_subarray_brute{
    public static void main(String[] args){
        String s = "babacc";
        String query = "bcb";
        int[] qu = {1,3,3};

        int[] res = new int[qu.length];
        char[] cha = s.toCharArray();

        for(int i = 0; i<qu.length; i++){
            int val = qu[i];
            cha[val] = query.charAt(i);

            int curr = 1;
            int max = 1;

            for(int j = 1; j<cha.length; j++){
                if(cha[j] == cha[j-1]){
                    curr++;
                }
                else{
                    curr = 1;
                }

                if(curr > max){
                    max = curr;
                }
            }

            res[i] = max;
        }

        for(int i = 0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }
}
