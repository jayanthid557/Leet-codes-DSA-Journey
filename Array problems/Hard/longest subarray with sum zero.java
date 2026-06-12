import java.util.*;
class main{
	public static void main(String[] args){
		int[] a = {9,-3,3,-1,6,5};
		int n = a.length;
 		int maxl = 0;
		int sum = 0;
		
		HashMap<Integer, Integer> m = new HashMap<>();
		
		for(int i = 0; i<a.length; i++){
			sum += a[i];
			
			if(sum == 0){
				maxl = i+;
			}
			else if(prefixMap.containsKey(sum)){
				maxl = Math.max(maxl, sum);
			}
			else{
				prefixMap.put(sum,i);
			}
		}

		System.out.println(maxl); 
	}
}