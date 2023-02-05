package A20221101;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ddd8 {
    public static void main(String[] args) {
        String s="   -42 4193 with words";
        myAtoi(s);
    }
    public  static  int myAtoi(String s) {
        String regex = "[-?[\\d]]+";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(s);
        int i=0;
        while (matcher.find()) {
            i = Integer.parseInt(matcher.group());
            break;
        }
        System.out.println(i);
        return i;


    }
}
