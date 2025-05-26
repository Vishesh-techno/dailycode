import java.util.Arrays;

public class TwentySixMay {
    public static int findLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static int trap(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = nums[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i], nums[i - 1]);
        }
        right[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i], nums[i + 1]);
        }
        for (int i = 0; i < n; i++) {
            int water = Math.min(left[i], right[i] - nums[i]);
            sum += water;
        }
        return sum;
    }

    public static int[] productexceptself(int[] nums) {
        int product = 1;
        int n = nums.length;
        int[] op = new int[n];
        for (int i = 0; i < nums.length; i++) {
            product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            op[i] = product;
        }
        return op;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 6, 3, 2, 6, 1};
        int k = 4;
        System.out.println("the largest fourth is  " + findLargest(nums, k));
        System.out.println("the total collected water is " + trap(nums));
        System.out.println("The total product of array except self is: " + Arrays.toString(productexceptself(nums)));
    }

}
