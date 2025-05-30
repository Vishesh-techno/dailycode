import java.util.*;

public class ThirtyMay {
    public static int minandmax(int[] nums){
        Arrays.sort(nums);
        int secondMin = nums[2];
        int secondMax = nums[nums.length-2];
        System.out.println(secondMin);
        return secondMax;
    }

    public static void main(String[] args) {
        int[] nums = {2,4,5,5,6,78,6,5,6,5,-5,-6,415,0,45};
        System.out.println(minandmax(nums));
    }
}
