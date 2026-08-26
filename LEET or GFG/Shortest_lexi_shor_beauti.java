public class Shortest_lexi_shor_beauti{
    public static void main(String[] args) {
        String s1 = "100011001";
        int k1 = 3;
        System.out.println("Result 1: " + short_SUB(s1, k1));
    }

    static String short_SUB(String s, int k) {
        int n = s.length();
        String ans = "";
        int count = 0;
        int i = 0;

        for (int j = 0; j < n; j++) {
            if (s.charAt(j) == '1') {
                count++;
            }
            while (count == k) {
                String sub = s.substring(i, j + 1);
                
                if (ans.isEmpty() || sub.length() < ans.length() || (sub.length() == ans.length() && sub.compareTo(ans) < 0)) {
                    ans = sub;
                }

                if (s.charAt(i) == '1') {
                    count--;
                }

                i++;
            }
        }

        return ans;
    }
}