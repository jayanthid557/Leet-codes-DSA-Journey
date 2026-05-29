class main{
    public static void main(String[] args){
        int[] a = {-1,0,1,1,2,3};
        int i = 0;
        
        while(i<a.length-2){
            int sum = a[i] + a[i+1] + a[i+2];
            if(sum == 0){
                System.out.println(a[i]);
                System.out.println(a[i+1]);
                System.out.println(a[i+2]);
            }
            i++;
        }
    }
}