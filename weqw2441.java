import java.util.Arrays;

public class weqw2441 {
    public static void main(String[] args) {
        int[] nums = {-1,10,6,7,-7,1};
        System.out.println(findMaxK(nums));
    }
    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length-1; i >=0; i--) {
           if (nums[i]<=0){
               return -1;
           }
            for (int i1 = 0; i1 < i; i1++) {
                if (nums[i1]>=0){
                    break;
                }
                if (nums[i]==-1*nums[i1]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
