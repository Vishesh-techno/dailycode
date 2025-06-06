import java.util.Arrays;

public class TwentyNineMay {
    public static int minandmax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        return max;
    }

    public static void reverse(int[] num) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(num));
    }
    public static int maxsSubArray(int[] nums){
//        Kadane's Algorithm
        int cs =0;
        int max = Integer.MIN_VALUE;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            cs = cs + nums[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return ms;
    }
    public static Boolean duplicateElement(int[] nums){
        for(int i =0; i<nums.length-1; i++){
            for(int j =i+1; i<nums.length; i++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static Boolean dupElement(int[] nums){
        int left = 0, right = nums.length;
        while(left == right){
            return true;
//            left++;
//            right--;
        }
        return false;
    }

//    public static int choclateDistributionProb(int[] nums){
//        Arrays.sort(nums);
//        int left = 0;
//        int right = nums.length - 1;
//    }



    public static void main(String[] args) {
        int[] no = {1, 2, 3, 5, 6, 7, 89, 5, 2, 2, 6, 3, 4, -85,};
        minandmax(no);
        reverse(no);
        System.out.println(maxsSubArray(no));
        System.out.println(duplicateElement(no));
        System.out.println(dupElement(no));
    }
}
