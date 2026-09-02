import java.util.*;
class Unoccupied_Computers{
    public static void main(String[] args){
        String s = "ABCBAC";
        int n = 1;

        System.out.println(solve(n,s));
    }

    static int solve(int n, String s){
        HashMap<Character,Boolean> map = new HashMap<>();
        int ans = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(!map.containsKey(ch)){
                if(n > 0){
                    n--;
                    map.put(ch,true);
                }
                else{
                    ans++;
                    map.put(ch,false);
                }
            }
            else{
                if(map.get(ch)){
                    n++;
                }
            }
        }

        return ans;
    }
}