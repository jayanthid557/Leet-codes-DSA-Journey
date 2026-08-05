import java.util.*;
class Max_Nesting_Depth{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = s.nextLine();
        
        int curr = 0;
        int max = 0;
        
        for(int i = 0; i< s1.length(); i++){
            if(s1.charAt(i) == '('){
                curr ++;
            }
            else if(s1.charAt(i) == ')'){
                curr--;
            }
            
            max = Math.max(curr,max);
        }
        System.out.println(max);
    }
}