import java.util.*;

public class ThirtyMay {
    public static int minandmax(int[] nums){
        Arrays.sort(nums);
        int secondMin = nums[2];
        int secondMax = nums[nums.length-2];
        System.out.println(secondMin);
        return secondMax;
    }
    public static int buyandSellStock(int[] nums){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < nums.length; i++) {
            minPrice = Math.min(nums[i], minPrice);
            maxProfit = Math.max(maxProfit, nums[i] - minPrice);
        }
        return maxProfit;
    }
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i <= prices.length-1; i++){
            if(prices[i] < min){
                min = prices[i];
            }else if (prices[i] - min > max){
                max = prices[i] - min;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] nums = {2,4,5,5,6,78,6,5,6,5,-5,-6,415,0,45};
        System.out.println(minandmax(nums));
        System.out.println(buyandSellStock(nums));
        System.out.println(maxProfit(nums));
    }
}
