public class TwentyNineMay {
    public static int minandmax(int[] nums){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        return max;
    }


    public static void main(String[] args) {
        int[] no = {1,2,3,5,6,7,89,5,2,2,6,3,4,-85, };
        minandmax(no);
    }
}
