package A20230102;

public class dfsfd16 {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        System.out.println(threeSumClosest(nums, 1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int reduce=9000;
        int numResult=nums[1]+nums[2]+nums[3];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int num = nums[i]+nums[j]+nums[k];
                   int  reduce2=num-target;
                    if (reduce2==0){
                        System.out.println(nums[i]+""+nums[j]+""+nums[k]);
                        System.out.println(i+""+j+""+k);
                        return num;
                    }
                    if (Math.abs(reduce2)<Math.abs(reduce)){
                        reduce=reduce2;
                        numResult=num;
                    }

                }
            }
        }
        return numResult;
    }

}
