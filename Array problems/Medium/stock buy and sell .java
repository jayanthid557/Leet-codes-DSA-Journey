class main{
    public static void main(String[] args){
        int[] a = {7,1,5,3,6,4};
        int min = a[0];
        int max = 0;
        int current;
        for(int i = 0; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
            current = a[i];
            max = Math.max(max,current-min);
        }
        
        System.out.print(max);
    }
}