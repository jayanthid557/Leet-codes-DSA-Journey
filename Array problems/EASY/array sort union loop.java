import java.util.*;
class main{
    public static void main(String[] args){
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,3,4,4,5};
        int m = a1.length;
        int n = a2.length;
        
        int[] r = new int[m+n];
        int idx = 0;
        
        for(int i =0; i<m; i++){
            r[idx] = a1[i];
            idx++;
        }
        
        for(int i =0; i<n; i++){
            r[idx] = a2[i];
            idx++;
        }
        
        r = Arrays.stream(r).distinct().sorted().toArray();
        
        for(int i=0; i<r.length; i++){
            System.out.print(r[i]+" ");
        }
    }
}