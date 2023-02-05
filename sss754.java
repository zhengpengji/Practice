package A20221101;

import java.util.ArrayList;
import java.util.Collections;

public class sss754 {
    public static void main(String[] args) {
             reachNumber(2);
    }
    public static int reachNumber(int target) {
        int Sum=0;
        int i =0;
        target=Math.abs(target);
        while (Sum<target){
            i++;
            Sum=Sum+i;
            System.out.println(Sum);
    }
        while ((Sum-target)%2!=0){
            i++;
            Sum=Sum+i;
        }
        System.out.println(i);
        return i;
}
}
