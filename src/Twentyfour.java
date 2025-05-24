public class Twentyfour {
    public static void maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currSum = 0;
                for (int k = i; k < j; k++) {
                    currSum += nums[k];
                }
                System.out.println();
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
    public static void prefixMaxSubArray(int[] nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];

        }
        for (int i = 0; i < nums.length; i++) {
            int Start = i;
            for (int j = i; j < nums.length; j++) {
                int End = j;
                currSum = Start == 0 ? prefixSum[End] : prefixSum[End] - prefixSum[Start-1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum by prefix = " + maxSum);
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(nums);
        prefixMaxSubArray(nums);
    }
}
