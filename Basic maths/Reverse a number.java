class Solution {
    public int reverse(int x) {
        int temp = x;
        int dig;
        int rev = 0;

        while (temp != 0) {
            dig = temp % 10;
            
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            
            rev = rev * 10 + dig;
            temp = temp / 10;
        }

        int temp1 = rev;
        if (temp1 % 10 == 0) {
            rev = rev / 10;
        }

        return rev;
    }
}