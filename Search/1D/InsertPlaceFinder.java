public class InsertPlaceFinder{
    public static void main(String[] args){
        int[] a = {1,2,3,5,6};
        int x = 4;

        int insert = InsertPlace(a,x);
        System.out.println("Insert at position (as per zero as start):  " + insert);
    }

    static int InsertPlace(int[] a, int x){
        int l = 0;
        int h = a.length-1;
        int ans = a.length;   

        while(l<h){
            int mid = (l+h)/2;

            if(a[mid] <= x){
                l = mid + 1;
            }
            else{
                h = mid - 1;
                ans = mid;
            }
        }

        return ans;
    }
}
