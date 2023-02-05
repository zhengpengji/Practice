package A20230102;

import java.util.HashMap;

public class ffeww45 {
    public static void main(String[] args) {
           int[] nums={2,3,1,1,4};
        System.out.println(jump(nums));
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        System.out.println(map.get(1));
        System.out.println(map.get(2));
    }
    public static int jump(int[] nums) {
        if (nums.length==1){
            return 0;
        }
        int first = 0;
        int max = 0;
        int count =0;
        while (true) {
            int num = nums[first]+first;
            if (num>=nums.length-1){
                count++;
                break;
            }
            for (int i = first+1; i <= num; i++) {
               int maxF=i+nums[i];
               if (max<maxF){
                   first=i;
                   max=maxF;
               }
            }
            count++;
            max=0;
        }
        return count;
    }

}
