class Binarysearch{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int t = 3;
        //Binary search 
        System.out.println(Bin(a,t,0,a.length-1));
    }

    static boolean Bin(int[] a, int t, int l, int h){
        int m = (l+h)/2;
        if(l>h){
            return false;
        }
        if(a[m] == t){
            return true;
        }
        else if(a[m] > t){
            return Bin(a, t, l, m-1);
        }
        else{
            return Bin(a, t, m+1, h);
        }
    }
}
