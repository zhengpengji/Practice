public class removeElement27 {
    public static void main(String[] args) {
        int[] nums ={3,2,2,3};
        int val = 3;
//        int[] b = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }

        }

            System.out.println(j);
        for (int i1 = 0; i1 < nums.length; i1++) {
            System.out.print(nums[i1]);
        }
    }
    }
