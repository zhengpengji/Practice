import java.sql.SQLOutput;

public class lengthWrrd58 {
    public static void main(String[] args) {
        String s=" fly me to  the moom";
          int a = 0;
        System.out.println(s.charAt(10));
        for (int i = 0; i < s.length(); i++) {
            if (i==s.length()-1&&s.charAt(i)==' '){
                int b = s.length()-a-1-1;
                System.out.println("���һ����"+a+"���һ�����ʳ�����"+b);
            }

            if (s.charAt(i)==' '){
                System.out.println(i);
                a=i;
            }
            if (i==s.length()-1){
                int b = s.length()-a-1;
                System.out.println("���һ����"+a+"���һ�����ʳ�����"+b);
            }

        }
    }
}
