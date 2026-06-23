public class RotatedSorted_II {
    public static void main(String[] args){
        int[] a = {1,1,1,1,1};
        int x = 1;

        System.out.println(Finder(a,x));
    }

    static boolean Finder(int[] a , int x){
        int l = 0;
        int h = a.length-1;
        boolean ans = false;

        while(l<=h){
            int mid = (l+h)/2;
            
            if(a[mid] == x){
                ans = true;
            }
            
            if(a[l] == a[mid] && a[h] == a[mid]){
                l++;
                h--;
            }
            else if(a[l] < a[mid]){
                if(a[l] <= x && x <= a[mid]){
                    h = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
            else{
                if(a[mid] <= x && x < a[h]){
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
