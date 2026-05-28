import java.util.Arrays;

class main{
    public static void main (String[] args) {
        int[] a = {1,2,3,1,1,2};
        Arrays.sort(a);

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
        if(count >= a.length/3){
            System.out.print(me);
        }
    }
}