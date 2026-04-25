class main{
    public static void main(String[] args){
        int[] a = {1,2,-4,-7};
        int[] r = new int[a.length];
        int pidx = 0;
        int nidx = 1;
        for(int i = 0; i<a.length; i++){
            if(a[i] < 0){
                r[nidx] = a[i];
                nidx = nidx+2;
            }
            else{
                r[pidx] = a[i];
                pidx = pidx+2;
            }
        }
        
        for(int i = 0;i<a.length; i++){
            System.out.print(r[i] + " ");
        }
    }
}