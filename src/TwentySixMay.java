import java.util.Arrays;

public class TwentySixMay {
    public static int findLargest(int[] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public static int trap(int[] nums){
        int n = nums.length;
        int sum = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = nums[0];
        for(int i = 1; i < n; i++){
            left[i] = Math.max(left[i], nums[i-1]);
        }
        right[n-1] = nums[n-1];
        for(int i = n-2; i>= 0; i--){
            right[i] = Math.max(right[i], nums[i+1]);
        }
        for(int i = 0; i < n; i++){
            int water = Math.min(left[i], right[i] - nums[i]);
            sum += water;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,6,3,2,6,1};
        int k = 4;
        System.out.println(findLargest(nums, k));
        System.out.println("the total collected water is " + trap(nums));


    }
}
