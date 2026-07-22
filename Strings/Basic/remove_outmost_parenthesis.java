public class remove_outmost_parenthesis{
    public static void main(String[] args){
        String s = "((())())";
        int count = 0;
        String ans = "";
        
        for (char ch : s.toCharArray()){
            if(ch == '('){
                if(count > 0){
                    ans += ch;
                }
                count++;
            }
            if(ch == ')'){
                count--;
                if(count>0){
                    ans += ch;
                }
            }
        }
        
        System.out.println(ans);
    }
}