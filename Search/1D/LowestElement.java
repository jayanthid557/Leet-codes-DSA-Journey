class LowestElement{
    public static void main(String[] args){
        int[] a = {5,1,2,3,4};
        
        int l = 0;
        int h = a.length-1;
        int ans = a.length;

        while(l <= h){
            int mid =(l+h)/2;

            if(a[mid] > a[h]){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
            ans = l;
        }


        System.out.println(ans);
    }
}