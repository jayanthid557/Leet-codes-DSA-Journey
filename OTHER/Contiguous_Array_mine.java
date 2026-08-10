class Contiguous_Array_mine {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1};
        
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int oC = countOnes(nums, i);
                int zC = countZeros(nums, i + oC);
                
                if (zC > 0) {
                    maxLen = Math.max(maxLen, 2 * Math.min(oC, zC));
                    i += oC + zC - 1;
                }
            }
        }
        
        System.out.println(maxLen);
    }

    static int countOnes(int[] a, int start) {
        int count = 0;
        while (start < a.length && a[start] == 1) {
            count++;
            start++;
        }
        return count;
    }

    static int countZeros(int[] a, int start) {
        int count = 0;
        while (start < a.length && a[start] == 0) {
            count++;
            start++;
        }
        return count;
    }
}