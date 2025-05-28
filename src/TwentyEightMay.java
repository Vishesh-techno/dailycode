public class TwentyEightMay {
    public static int findMaxWater(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;
        while (left < right) {
            int h = Math.min(arr[left], arr[right]);
            int w = right - left;
            int area = h * w;
            maxArea = Math.max(maxArea, area);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main (String[]args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("the max area of water is: " + findMaxWater(arr));
    }
}
