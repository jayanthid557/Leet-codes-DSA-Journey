public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] a = {"flower", "flow", "flight"};

        if (a.length == 0) {
            System.out.println("");
            return;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < a[0].length(); i++) {

            char ch = a[0].charAt(i);

            for (int j = 1; j < a.length; j++) {

                if (i >= a[j].length() || a[j].charAt(i) != ch) {
                    System.out.println(ans.toString());
                    return;
                }
            }

            ans.append(ch);
        }

        System.out.println(ans.toString());
    }
}