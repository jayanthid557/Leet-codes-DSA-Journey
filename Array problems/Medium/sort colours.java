import java.util.Arrays;

class Main {
    public static void main(String[] args){
        int[] a = {1, 0, 2, 1, 0};
        Arrays.sort(a);
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}