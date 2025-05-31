public class ThirtyOneMay {
    public static int maxsubArray(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            cs = cs+nums[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs, ms);
            if(nums[i] > maxElement){
                maxElement = nums[i];
            }
        }
        if(ms == 0 && maxElement < 0){
            return maxElement;
        }
        return ms;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,58,4,8,21,5,-5};
        System.out.println(maxsubArray(nums));
    }
}
