import java.util.Scanner;

public class ClimbStairs {

    public static void main(String[] args) {
        Scanner STR = new Scanner(System.in);
        int S=STR.nextInt();
        if (S<=2){
            System.out.println("爬楼梯的方法有"+1+"次");
        }
        int I2=1;
        int I3=2;
        int Is=0;
        for (int i = 3; i <=S; i++) {

            Is=I2+I3;
            I2=I3;
            I3=Is;


        }
        System.out.println(Is);
    }
}
