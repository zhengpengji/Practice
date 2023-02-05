public class test {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] > target) {
                return i + 1;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] a = {"",""};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
