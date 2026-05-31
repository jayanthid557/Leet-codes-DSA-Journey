import java.util.*;
class main{
	public static void main(String[] args){
		int[] a = {9,-3,3,-1,6,5};
		int n = a.length;
 		int maxl = 0;
	
		for(int i = 0; i<n; i++){
			int sum = 0;
			for(int j = i; j<n; j++){
				sum += a[j];
				if(sum == 0){
					int length = j-i+1;
					maxl = Math.max(length,maxl);
				}
			}
		}
		
		System.out.println(maxl);
	}
}