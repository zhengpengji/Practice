package A20230102;

import java.util.Arrays;

public class rrr97 {
    public static void main(String[] args) {
       String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
        System.out.println(isInterleave(s1, s2, s3));

    }
    public static boolean isInterleave(String s1, String s2, String s3) {
        int len1=0;
        int len2=0;
        int countS3=0;
        for (int i = 0; i < s3.length(); i++) {
            if (len1<s1.length()&&s3.charAt(i)==s1.charAt(len1)){
                len1++;
                System.out.println(len1+"AAA");
                System.out.println(s3.charAt(i));
                continue;
            }
            if (len2<s2.length()&&s3.charAt(i)==s2.charAt(len2)){
                len2++;
                System.out.println(len2+"BBB");
                System.out.println(s3.charAt(i));
                continue;
            }
             countS3=i;
        }
        return true;
    }
}
