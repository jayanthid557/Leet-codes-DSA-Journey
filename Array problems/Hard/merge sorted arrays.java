class main{
	public static void main(String[] args){
		int[] a = {-5,-2,4,5,0,0,0};
		int[] b = {-3,1,8};
		int n = 0;
		int m = 0;
	
		for(int val : a){
			if(val!=0) m++;
		}
		for(int val : b){
			if(val!=0 ) n++;
		}
		
		int i = m-1;	
		int j = n-1;
		int k = m+n-1;

		while(i>= 0 && j>=0){
			if(a[i] > b[j]){
				a[k--] = a[i--];
			}
			else if(a[i] > b[j]){
				a[k--] = b[j--];
			}
		}
		
		while(j>=0){
			a[k--] == b[j--];
		}

		
		for(int val : a){
			System.out.println(a[val]);
	}
}