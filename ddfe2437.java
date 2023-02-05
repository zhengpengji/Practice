public class ddfe2437 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,4,8,2,2};
        minMaxGame(nums);
    }

    public static int minMaxGame(int[] nums) {
              if (nums.length==1){
                  return nums[0];
              }
        int[] newNums = new int[nums.length / 2];
        while (nums.length != 1) {


            for (int i = 0, j = 0; i < nums.length; ) {

                if (j == 0 || j % 2 == 0) {
                    int min = Math.min(nums[i], nums[i + 1]);
                    newNums[j] = min;

                }
                else  if (j % 2 != 0) {
                    int max = Math.max(nums[i], nums[i + 1]);
                    newNums[j] = max;

                }

                j++;
                i = i + 2;
            }
            for (int i = 0; i < newNums.length; i++) {
                System.out.println(newNums[i]);
            }
            System.out.println("=============");
            nums = newNums;
            int[] kong = new int[newNums.length / 2];
            newNums = kong;
        }
        return nums[0];
    }
}

