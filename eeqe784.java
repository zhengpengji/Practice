import java.util.ArrayList;
import java.util.List;

public class eeqe784 {
    public static void main(String[] args) {
       String s = "a551Ab223r";
       letterCasePermutation(s);
    }

    public static List<String> letterCasePermutation(String s) {
           List<String> list=new ArrayList<>();
           String first="";
           list.add(first);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                for (int i1 = 0; i1 < list.size(); i1++) {
                    list.set(i1,list.get(i1)+s.charAt(i));
                }
            }else if (s.charAt(i)>'Z'){
                list.addAll(list);
                for (int i1 = 0; i1 < list.size()/2; i1++) {
                    list.set(i1,list.get(i1)+s.charAt(i));
                }
                for (int i1 =list.size()/2; i1 < list.size(); i1++) {
                    list.set(i1,list.get(i1)+(char)(s.charAt(i)-32));
                }
            }else {
                list.addAll(list);
                for (int i2 = 0; i2 < list.size()/2; i2++) {
                    list.set(i2,list.get(i2)+s.charAt(i));
                }
                for (int i2 =list.size()/2; i2 < list.size(); i2++) {
                    list.set(i2,list.get(i2)+(char)(s.charAt(i)+32));
                }
            }
        }
        System.out.println(list);
        return list;
    }

}
