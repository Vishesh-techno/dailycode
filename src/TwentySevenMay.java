public class TwentySevenMay {
    public static int maxSubArraysum(int[] nums) {
        int product = 1;
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
            if (nums[i] > maxElement) {
                maxElement = nums[i];
            }
        }
        return ms;
    }

    public static int maxSubArrayProduct(int[] nums) {
        int product = 1;
        int n = nums.length;
        int maxp = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            product = product * nums[i];
            if (product < 0) {
                product = 1;
            }
            if (product > maxp) {
                maxp = product;
            }
            if (product == 0) {
                product = 1;
            }
        }
        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            product = product * nums[i];
            if(product < 0){
                     product = 1;
                 }
            if (product > maxp) {
                maxp = product;
            }
            if (product == 0) {
                product = 1;
            }
        }
        return maxp;
    }
    public static int findMin(int[] nums) {
        int minElement = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < minElement){
                minElement = nums[i];
            }
        }
        return minElement;
    }
    public static int findminoptimal(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left<right){
            int mid = (left + right)/2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4, -4, 3, 5};
        int[] num = {4,5,6,-1,2,3};
        System.out.println("The max sum of sub array is: " + maxSubArraysum(nums));
        System.out.println("The max product of sub array is: " + maxSubArrayProduct(nums));
        System.out.println("The min of array is: " + findMin(nums));
        System.out.println("The min of array is by optimal approach: " + findminoptimal(num));
    }
}
