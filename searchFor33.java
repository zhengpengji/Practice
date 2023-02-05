package A20230102;

public class searchFor33 {
    public static void main(String[] args) {
      int[]  nums = {4,5,6,7,0,1,2};
      int  target = 3;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        if (nums.length==1){
            if (target==nums[0]){
                return 0;
            }else return -1;
        }
        if (target==nums[0]){
            return nums[0];
        }
        if (target<nums[0]){
            for (int i = nums.length-1; i >=0; i--) {
               if (nums[i]<target){
                   return  -1;
               }
               if (nums[i]==target){
                   return nums[i];
               }
            }
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>target){
                return  -1;
            }
            if (nums[i]==target){
                return nums[i];
            }
        }
        return -1;
    }
}
