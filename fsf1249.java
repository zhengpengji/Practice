import java.util.ArrayList;

public class fsf1249 {
    public static void main(String[] args) {
      String s = "))((";
        System.out.println(minRemoveToMakeValid(s));
    }
    public static  String minRemoveToMakeValid(String s) {
      String A ="";
      int B=0;
        for (int i = 0; i < s.length(); i++) {
            char s1=s.charAt(i);
            if (s1!=')'){
                if (s1=='('){
                    A=A+s1;
                   B++;
                }
                if (s1!='('){
                    A=A+s1;
                }
            }
            if (s1==')'){
                if (B==0){

                }
                if (B!=0){
                   B--;
                    A=A+s1;
                }
            }


        }  System.out.println(A);
        if (B!=0){
            String string ="";
            for (int i =A.length()-1; i >=0; i--) {
                char s1=A.charAt(i);
                if (B!=0&&s1=='('){
                    B--;
                }else {
                    string=s1+string;
                }
            }
            A=string;
        };


        return A;

    }
}
