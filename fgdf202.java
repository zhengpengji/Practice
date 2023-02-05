public class fgdf202 {
    public static void main(String[] args) {
//        System.out.println(1000);
//        System.out.println(12/10);
//        System.out.println('1'-48);
        isHappy(19);
    }
    public static boolean isHappy(int n) {

          int Sum=0;
          int H= 0;
          while (H<20) {
              String N = "" + n;
              for (int i = 0; i < N.length(); i++) {
                  int C=(N.charAt(i)-48);
                  System.out.println(C);
                  Sum = C*C + Sum;
                  System.out.println(Sum);
              }

              if (Sum == 1) {
                  return true;
              }
              n = Sum;
              Sum=0;
              H++;
          }
          return false;
    }
}
