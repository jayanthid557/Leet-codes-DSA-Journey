class main{
	public static void main(String[] args){
		int[] nums = {1,3,4,5,5};
		int n = a.length;

		int x = (n*(n+1))/2;
		long x2 = (n*(n+1)*(2*n+1))/6;
		
		int y = 0;
		long y2 = 0;

		for(int val : nums){
			y += val;
			y2 += val*val;
		}

		int val1 = x - y;
		int val2 = x2 - y2;
		int val3 = val2/val1;

		int miss = (val3 + val1)/2;
		int rep = val3 - miss;

		System.out.println(rep);
		System.out.println(miss);
	}
}