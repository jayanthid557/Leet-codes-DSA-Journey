import java.util.*;

class main{
    public static void main (String[] args) {
        int[] a = {4,3,3,4,4,2,1,2,1,1};
        Arrays.sort(a);
        Scanner s = new Scanner(System.in);
	
	    System.out.println("Enter the target number: ");
	    int target = s.nextInt();

        int max = 1;
        int count = 1;
        int me = a[0];

        int i = 1;
        while(i < a.length){
            if(a[i] == a[i - 1]){
                count++;
            } else {
                if(count > max){
                    max = count;
                    me = a[i - 1];
                }
                count = 1;
            }
            i++;
        }

        if(count > max){
            me = a[a.length - 1];
        }
        
        System.out.println(count);
        if(count == target){
            System.out.print("True");
        }
    }
}