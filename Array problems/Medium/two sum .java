import java.util.Arrays;

class Main {
    public static void main(String[] args){
        int[] a = {2,6,5,8,11};
        int t = 14;

        Arrays.sort(a);

        int left = 0;
        int right = a.length - 1;

        while(left < right){
            int sum = a[left] + a[right];

            if(sum == t){
                System.out.println("YES");
                return;
            }
            else if(sum < t){
                left++;
            }
            else{
                right--;
            }
        }

        System.out.println("NO");
    }
}