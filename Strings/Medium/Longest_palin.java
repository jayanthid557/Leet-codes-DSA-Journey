public class Longest_palin {
    public static void main(String[] args){
        String s = "babad";
        String ans = "";
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                int curr = Pali(s, i, j);

                if(curr > max) {
                    max = curr;
                    ans = s.substring(i, j + 1);
                }
            }
        }

        System.out.println(ans);
    }

    static int Pali(String s, int i, int j){
        int len = j - i + 1;

        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return 0;
            }
            i++;
            j--;
        }

        return len;
    }
}
