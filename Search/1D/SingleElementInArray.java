public class SingleElementInArray {
    public static void main(String[] args){
        int[] a = {1,1,2,2,3,4,4};
        
        System.out.println(SingleFinder(a));
    }

    static int SingleFinder(int[] a){
        int l = 0;
        int h = a.length-1;
        int ans = 0;

        while(l<=h){
            int mid = (l+h)/2;

           if(a[mid] != a[mid+1] && a[mid] != a[mid-1]){
            ans = a[mid];
           }

           if(a[mid] == a[mid+1] && mid%2 == 0 || mid%2 == 1 && a[mid] == a[mid-1]){
            l = mid+1;
           }
           else{
            h = mid-1;
           }
        }
        return ans;
    }
}
