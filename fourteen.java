import java.util.ArrayList;

public class fourteen {
    public static void main(String[] args) {
//        String[] strs = {"dfedsdf", "dfedrwsdf", "dfswersfd"};
        String[] strs = {"", "", ""};
        if (strs.length==1){
            System.out.println(strs[0]);
        }
        String c = "";
        for (int i = 1; i < strs.length; i++) {
            String a = "";
            if (strs[i]==""){
                break;
            }
            if (strs[i].charAt(0) != strs[i - 1].charAt(0)){
                c=a;
                break;
            }
//            System.out.println(str[i].charAt(i));
//            System.out.println(str[i].length());
            for (int i1 = 0; i1 < strs[i].length(); i1++) {
                 if (strs[i].charAt(i1) == strs[i - 1].charAt(i1)) {
//                    strings.add(String.valueOf(str[i-1].charAt(i1)));
                    a = a + strs[i].charAt(i1);

                } else {
//
                    break;
                }
            }


            if (c.length() == 0) {
                    c = a;
                }
            if (c.length() > a.length()) {
                    c = a;
                }
            }

            System.out.println(c);
//            for (int j = 0; j < stringmin.size(); j++) {
//                System.out.println(stringmin.get(j));
//            }

        }


    }
