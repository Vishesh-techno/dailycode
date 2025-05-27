public class TwentySevenMay {
    public static int maxSubArraysum(int[] nums) {
        int product = 1;
        int cs =0;
        int ms = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            cs = cs + nums[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
            if(nums[i] > maxElement){
                maxElement = nums[i];
            }
        }
        return ms;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("The max sum of sub array is: " + maxSubArraysum(nums));
    }
}
