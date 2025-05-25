import java.util.Arrays;

public class TwentyFiveMay {
    public static int findMinDiff(int[] arr, int m) {
        int n = arr.length;
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n - m + 1; i++) {
            int minElement = arr[i];
            int maxElement = arr[i + m - 1];
            res = Math.min(res, maxElement - minElement);
        }

        return res;
    }
    public static int search(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void nextPermutation(int[] nums) {
        int i;
        for (i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        if (i >= 0) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }
        int start = i + 1;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - min);
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int m = 5;
        System.out.println("Min Difference: " + findMinDiff(arr, m));
        System.out.println("Index of " + m + ": " + search(arr, m));
        nextPermutation(arr);
        System.out.println("Next Permutation: " + Arrays.toString(arr));
        System.out.println("Max Difference: " + maxProfit(arr));
    }
}
