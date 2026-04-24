class main{
    public static void main(String[] args){
        int[] a = {2, 3, 5, -2, 7, -4};
        int s = 0;
        int ms = 0;
        
        for(int i = 0; i<a.length; i++){
            s = s+a[i];
            ms = Math.max(s,ms);
        }
        
        System.out.print(ms);
    }
}