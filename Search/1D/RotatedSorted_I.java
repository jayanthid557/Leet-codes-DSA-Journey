public class RotatedSorted_I {
    public static void main(String[] args){
        int[] a = {4,5,6,7,0,1,2};
        int x = 9;

        System.out.println(Finder(a,x));
    }

    static int Finder(int[] a, int x){
       int ans = -1;
       int l = 0;
       int h = a.length-1;
       
       while (l<=h) {
        int mid = (l+h)/2;

        if(a[mid] == x){
            ans = mid;
        }

        if(a[l] <= a[mid]){
            if(a[l] <= x && x <= a[mid]){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        else{
            if(a[mid] <= x && x <= a[h]){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
       }
       
       
       return ans;
    }
}
