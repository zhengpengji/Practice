import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sda169 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int Max = 0;
        int min = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                min++;
                if (min > nums.length / 2) {
                    return nums[i];
                }
            }
        } return 1;
    }
}
