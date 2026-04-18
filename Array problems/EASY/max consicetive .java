class Main {
    public static void main(String[] args) {
        int[] a = {1,1,1,0,1,0,1,1};
        int count = 0;
        int cmax = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] == 1){
                count++;
                cmax = Math.max(cmax, count); 
            }
            else{
                count = 0;
            }
        }
        
        System.out.println(cmax);
    }
}