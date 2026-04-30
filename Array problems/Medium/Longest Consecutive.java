import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {10, 5, 22, 4, 10, 6, 1, 12};
        Arrays.sort(nums);

        int longest = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                if (nums[i] == nums[i-1] + 1) {
                    currentStreak++;
                } else {
                    longest = Math.max(longest, currentStreak);
                    currentStreak = 1;
                }
            }
        }
        System.out.print(longest);
    }
}
