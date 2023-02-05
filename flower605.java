package A20221101;

public class flower605 {
    public static void main(String[] args) {
      int[]  flowerbed = {1,0,0,0,1};int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, 1));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        if (flowerbed[0]==0){
            count++;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i]==0){
                count++;
            }
            System.out.println("---"+count);
            if (flowerbed[i]!=0){
                System.out.println(count+"...");
                count=count-1;
                n=n-count/2;
                count=0;
            }
            if (i==flowerbed.length-1&&flowerbed[i]==0){
                count++;
                count=count-1;
                n=n-count/2;
            }
        }

        System.out.println(n);
        if (n<=0){
            return true;
        }
        return false;
    }
}
