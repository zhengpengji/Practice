package A20221101;

import java.util.HashMap;

public class dsdf53 {

    public static void main(String[] args) {
       int[] nums = {-1};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int Sum=0;
        int Max=0;
        int FSum=nums[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Sum=Sum+nums[i];
            FSum=Math.max(FSum,nums[i]);
            Max=Math.max(Sum,Max);
            if (Sum<=0){
                Sum=0;
            }
        }
        if (Max==0&&FSum<0){
            return FSum;
        }
        return Max;
    }
}
