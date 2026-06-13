import java.util.*;
class main{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,0};
		int n = a.length;
		int max = a[0];
		int min = a[0];
		int pro = a[0];

		for(int i = 1; i<n; i++){
			if(a[i] < 0){
				int temp = max;
				max = min;
				min = temp;
			}
			
			max = Math.max(a[i], max*a[i]);
			min = Math.min(a[i], min*a[i]);
			pro = Math.max(pro, max);
		}

		System.out.println(pro);
	}
}