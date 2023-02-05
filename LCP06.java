public class LCP06 {
    public static void main(String[] args) {
        int [] coins = {2,3,10};

        System.out.println(minCount(coins));
    }
    public static int minCount(int[] coins) {

        int sum=0;
        for (int i = 0; i < coins.length; i++) {
            sum=sum+coins[i]%2+coins[i]/2;
        }
        return sum;
    }
}
