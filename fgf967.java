package A20221101;

import java.util.*;

public class fgf967 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(Arrays.toString(numsSameConsecDiff(7,4)));
        Date c=new Date();
        System.out.println(d.getTime()-c.getTime());
    }
    public static  int[] numsSameConsecDiff(int n, int k) {
          int Start=(int)Math.pow(10,n-1);
          int end=(int)Math.pow(10,n);
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = Start; i < end; i++) {
            String s=""+i;
            for (int i1 = 0; i1 < n-1; i1++) {
                int i2 = Integer.parseInt(s.substring(i1, i1 + 1)) - Integer.parseInt(s.substring(i1 + 1, i1 + 2));
                if (Math.abs(i2)!=k){
                    break;
                }
                if(i1==n-2){
                   list.add(i);
               }
            }
        }
        int[] A=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            A[i]=list.get(i);
        }
          return A;
    }
}
