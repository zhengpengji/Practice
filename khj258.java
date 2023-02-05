public class khj258 {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    public static int addDigits(int num){
        int SUM= 0;
        while (true){
            int X= num%10;
               num = num/10;
             SUM=SUM+X;


            if (num==0){
                if (SUM<10){
                    break;
                }
                System.out.println("..."+SUM);
                num=SUM;
                SUM=0;
            }

        }
        return SUM;
    }
}
