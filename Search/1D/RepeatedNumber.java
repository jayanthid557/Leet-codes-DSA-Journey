public class RepeatedNumber{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
    

        int l = 0;
        int h = a.length-1;

        while (l<=h) {
            int mid = (l+h)/2;
    
            if(a[mid] > a[h]){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }

        System.out.println(l);
    }
}
