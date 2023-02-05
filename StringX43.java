package A20221101;

public class StringX43 {
    public static void main(String[] args) {
      String num1="2";
      String num2="3";
        System.out.println(multiply(num1, num2));
    }
    public static String multiply(String num1, String num2) {
        long a =0;
        long b =0 ;
        long l=0;
        char[] chars = num1.toCharArray();
        char[] chars1 = num2.toCharArray();
        for (char aChar : chars) {
            a = a * 10 + (aChar - 48);
            System.out.println("a"+a);
        }
        for (int i = 0; i < chars1.length; i++) {
            b=b*10+(chars1[i]-48);
            System.out.println("b"+b);
        }
        long re=a*b;
        String s = String.valueOf(re);
        return s;
    }
}
