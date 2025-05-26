import java.util.Arrays;

public class TwentySixMay {
    public static int findLargest(int[] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public static void main(String[] args) {
        int[] nums = {5,4,6,3,2,6,1};
        int k = 4;
        System.out.println(findLargest(nums, k));
    }
}
