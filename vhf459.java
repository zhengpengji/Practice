public class vhf459 {
    public static void main(String[] args) {
        String S = "abc";
        System.out.println( repeatedSubstringPattern(S));
    }
    public static boolean repeatedSubstringPattern(String s) {
        int X = 0; int Y=0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(0)==s.charAt(i)){
                X = i;
                System.out.println(i);
                System.out.println(s.substring(0,i));
                break;
            }
        }
        if (X==0||s.length()%X!=0){
            return false;
        }

        for (int i = X; i < s.length(); i=i+X) {
            System.out.println(s.substring(i,i+X));
            if (!s.substring(0,X).equals(s.substring(i,i+X))){
                return false;
            }
        }
        return true;
    }
}
