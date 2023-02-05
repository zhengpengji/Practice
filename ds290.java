import java.util.Arrays;
import java.util.HashMap;

public class ds290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }
    public  static  boolean wordPattern(String pattern, String s) {

        HashMap<String,String> map=new HashMap<>();
        String[] s1 = s.split(" ");
        if (pattern.length()!=s1.length){
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            String PA=String.valueOf(pattern.charAt(i));
            if (!map.containsKey(PA)) {
                map.put(PA, s1[i]);
//                System.out.println(map.get(String.valueOf(pattern.charAt(i)))+"---"+s1[i]);
                continue;
            }
            System.out.println(map.get(PA)+"---"+s1[i]);
           if (!map.get(PA).equals(s1[i])){
               return false;
           }
        }
        HashMap<String,String> pm=new HashMap<>();
        for (String s2 : map.keySet()) {
            if (!pm.containsKey(map.get(s2))){
                pm.put(map.get(s2),s2);
            } else return false;
        }


        System.out.println(map);
        return true;
    }
}
