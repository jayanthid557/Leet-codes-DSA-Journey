import java.util.*;
public class Marks_for_ranks{
    public static void main(String[] args){
        int[] l = {1, 6, 14};
        int[] r = {3, 9, 15};
        int[] rank = {2, 5, 8};

        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < l.length && j < r.length){
            int val = l[i];
            while(val <= r[j]){
                ans.add(val);
                val++;
            }
            i++;
            j++;
        }

        for(int p = 0; p<rank.length;p++){
            int val = ans.get(rank[p]-1);
            res.add(val);
            res.get(val);
        }
    }
}
