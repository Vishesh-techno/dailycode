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
    public static void kadane(int[] nums) {
        int crSum = 0;
        int mxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            crSum += nums[i];
            if(crSum < 0){
                crSum = 0;
            }
            mxSum = Math.max(mxSum, crSum);
        }
        System.out.println("Max Sum using kadanes's algorithm = " + mxSum);
    }

    public static void kadaneforall(int[] nums) {
        int crSum = 0;
        int mxSum = Integer.MIN_VALUE;
        boolean allNegative = true;
        int maxNegative = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                allNegative = false;
            }
            if (nums[i] > maxNegative) {
                maxNegative = nums[i];
            }
            crSum += nums[i];
            if (crSum < 0) {
                crSum = 0;
            }
            mxSum = Math.max(mxSum, crSum);
        }

        if (allNegative) {
            System.out.println("Max Sum (All Negative) = " + maxNegative);
        } else {
            System.out.println("Max Sum using Kadane's algorithm = " + mxSum);
        }
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(nums);
        prefixMaxSubArray(nums);
        kadane(nums);
        kadaneforall(nums);
    }
}
