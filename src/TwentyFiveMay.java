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
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int m = 5;
        System.out.println(findMinDiff(arr, m));
    }
}
