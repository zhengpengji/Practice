import java.util.*;

public class dfsd229 {
    public static void main(String[] args) {
        int[] nums = {8,8,8,8};
        System.out.println(majorityElement(nums));
        int[] a={1,1,2,2,1,1,1,1,2,2,1,1};
        Arrays.sort(a);
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);

        }
    }

    public static List<Integer> majorityElement(int[] nums) {
        if (nums.length==1){
            List<Integer> list=new ArrayList<>();
            list.add(nums[0]);
            return list;
        }
        Arrays.sort(nums);
        int Max = 0;
        int min = 1;
        List<Integer> list=new ArrayList<>();
        if (nums.length==2){
            if (nums[0]==nums[1]){
                list.add(nums[0]);
                return list;
            }
            if (nums[0]!=nums[1]){
                list.add(nums[0]);
                list.add(nums[1]);
                return list;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                min++;
                if (min > nums.length / 3) {
                    list.add(nums[i + 1]);
                    min = 1;
                }
            }
            if (nums[i] != nums[i + 1]) {
                min = 1;
            }
        }
        System.out.println(list+"wdasda");
        if (list.size()>=2){
           Collections.sort(list);
           for (int i = 0; i < list.size()-1;i++) {
               if (list.get(i)==list.get(i+1)){
                   list.remove(i);
                   i--;
               }
           }
       }
        return list;
        }
    }

