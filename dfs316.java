package A20230102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class dfs316 {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println(removeDuplicateLetters(s));
    }
    public static String removeDuplicateLetters(String s) {
        char[] chars = s.toCharArray();
        char min =10000 ;
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]<min){
                min=chars[i];
                sb.append(chars[i]);
                System.out.println(sb);
                continue;
            }
            for (int i1 = 0; i1 < sb.length(); i1++) {
                if (sb.charAt(i1)==chars[i]) {
                    sb.deleteCharAt(i1);
                    sb.append(chars[i]);
                    System.out.println(sb+"2w");
                    break;
                }
                if (i1==sb.length()-1){
                    sb.append(chars[i]);
                    System.out.println(sb+"7w");
                }
            }
        }

        return   sb.toString();
    }
}
