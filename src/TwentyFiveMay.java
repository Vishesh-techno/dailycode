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
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int m = 5;
        System.out.println(findMinDiff(arr, m));
        System.out.println(search(arr, m));

    }
}
