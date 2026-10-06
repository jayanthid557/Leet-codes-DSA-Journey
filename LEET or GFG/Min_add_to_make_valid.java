public class Min_add_to_make_valid{
    public static void main(String[] args){
        String s = "(((";

        System.out.println(minAddToMakeValid(s));
    }
    static int minAddToMakeValid(String s) {
        int c1 = 0;
        int c2 = 0;

        if(s.length() == 0){
            return 0;
        }

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                c1++;
            }
            else {
                if(c1 > 0){
                    c1--;
                }
                else{
                    c2++;
                }
            }
        }

        return c1+c2;
    }
}
