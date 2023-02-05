package A20221101;

import java.math.BigInteger;

public class ss29 {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }
    public static int divide(int dividend, int divisor) {
        int Count=0;
        int Sum=0;
        int I=1;
        if (dividend<0&&divisor>0){
            I=-1;
        }
        if (dividend>0&&divisor<0){
            I=-1;
        }
        if (dividend==-2147483648&&divisor==1){
            return -2147483648;
        }
        if (dividend==-2147483648&&divisor==-1){
            return 2147483647;
        }
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        while (Sum+divisor<=dividend){
           Sum=Sum+divisor;
            Count=Count+1;
        }
        if (I==-1){
            Count=Count-Count-Count;
        }
        System.out.println(Count);
        return Count;
    }
}
