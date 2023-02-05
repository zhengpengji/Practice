package A20221101;

import java.util.ArrayList;
import java.util.List;

public class wewe3 {
    public static void main(String[] args) {
            String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static  int lengthOfLongestSubstring(String s) {
        String re="";
        int length=0;
        int max=0;
        List<Character> list=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            boolean b=false;
            int K=0;
            char c = s.charAt(i);
            for (int i1 = 0; i1 < list.size(); i1++) {
                if(list.get(i1)==c){
                    K=i1;
                 b=true;
                }
            }
            if (b){
                list=list.subList(K+1,list.size());
                length=list.size();
                System.out.println(list+"----"+length);
            }list.add(c);
            length=length+1;
            max=Math.max(length,max);
        }
        return max;
    }
}
