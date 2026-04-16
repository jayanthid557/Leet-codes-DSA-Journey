class main{
    public static void main(String[] args){
        int[] a = {4,0,2,0,1,0,5};
        int idx = 0;
        for(int i =0; i<a.length; i++){
            if(a[i] != 0){
                a[idx] = a[i];
                idx++;
            }
        }
        while (idx < a.length) {
            a[idx++] = 0;
        }
        
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}