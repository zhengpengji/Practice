import java.util.ArrayList;

public class perfect507 {
    public static void main(String[] args) {
       checkPerfectNumber(28);

    }

        public static   boolean checkPerfectNumber(int num) {
            if (num==1){
                return false;
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            int Sqrt = (int) Math.ceil( Math.sqrt(num));
            System.out.println(Sqrt);
            for (int i = 2; i < Sqrt; i++) {

                if (num%i==0){
                    arrayList.add(i);
                    System.out.println(i);
                    arrayList.add(num/i);
                    System.out.println(num/i);
                }
            }
            int sum = 1;
            for (int i = 0; i < arrayList.size(); i++) {
               sum=sum+ arrayList.get(i);
            }

            System.out.println("sum"+sum);
            return sum==num;
            }

        }



