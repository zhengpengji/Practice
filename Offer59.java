package A20221101;

import java.util.*;

public class Offer59 {
    public static void main(String[] args) {
       int[] nums = {1,3,-1,-3,5,3,6,7};
       maxSlidingWindow(nums,3);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
     if (nums.length==1){
         return nums;
     }
     ArrayList<Integer> list=new ArrayList<>();
     int[] result=new int[nums.length-k+1];
        int max=0;
        int MaxIndex=0;
        for (int i = 0; i < k; i++) {
           max=Math.max(max,nums[i]);
           if (max==nums[i]){
               MaxIndex=i;
           }
        }
        list.add(max);
//        System.out.println(max+""+MaxIndex);
        for (int i = k; i < nums.length; i++) {
            if (i-k>=MaxIndex){
                max=nums[i];
                for (int J = i-k+1 ;J <i; J++) {
                    max=Math.max(max,nums[J]);
                    if (max<=nums[J]){
                        MaxIndex=J;
                    }
                }
            }
            if (nums[i]>=max){
                max=nums[i];
                MaxIndex=i;
                list.add(max);
            }else {
                list.add(max);
            }
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            result[i]=list.get(i);
        }
        return result;
    }
}
