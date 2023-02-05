public class One {


    public static void main(String[] args) {
        One one= new One();
        int[] a={1,2,5,5};
        int b = 10;
        for (int i = 0; i < one.twoSum(a,b).length; i++) {
            System.out.println(one.twoSum(a,b)[i]);
        }

    }







    public int[] twoSum(int[] nums,int target){
            int[] array=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i+1; i1 < nums.length; i1++) {
                if (nums[i]+nums[i1]==target){
                    array[0]=i;
                    array[1]=i1;
                    return array;
                }

            }
        }




        return array;
    }



}
