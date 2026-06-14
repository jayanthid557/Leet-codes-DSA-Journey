import java.util.*;
class main{
	public static void main(String[] args){
		int[][] n = {{1,3}, {2,6}, {8,10}, {15,18}};
		Array.sort(n,(a,b)->Integer.compare(a[0],b[0]));
		List<List<Integer>> mer = new ArrayList<>();
		
		for(int[] x: n){
			if(merged.isEmpty() || merger.get(merged.size() - 1)[1] < n[0]){
				merged.add(n);
			}
			else{
				merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.side() - 1)[1] , n[1]);
			}
		}
		
		for(int i : n){
			System.out.println(n[i] + " ");
		}
	}
}	