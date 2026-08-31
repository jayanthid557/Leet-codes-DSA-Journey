public class Remove_max_min{
    public static void main(String[] args){
        int[] nums = {2,10,7,5,4,1,8,6};
        int max = nums[0];
        int min = nums[0];
        int max_idx = 0;
        int min_idx = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                max_idx = i;
            }
            if(nums[i] < min){
                min = nums[i];
                min_idx = i;
            }
        }

        int n = nums.length;
        int left = Math.min(min_idx, max_idx);
        int right = Math.max(min_idx, max_idx);

        int front = right + 1;
        int back = n - left;
        int both = left + 1 + n - right;

        System.out.println(Math.min(front, Math.min(back, both)));
    }
}
