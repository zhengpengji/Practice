package A20230102;

public class GusetNumber {
    public static void main(String[] args) {
        String secret="1123";
        String guess="0111";
        System.out.println(getHint(secret, guess));
    }
    public static String getHint(String secret, String guess) {
        int CountA = 0;
        int CountB = 0;
        StringBuilder A =new StringBuilder();
        StringBuilder B =new StringBuilder();
        for (int i = 0; i < secret.length(); i++) {
            char a =secret.charAt(i);
            char b =guess.charAt(i);
            if(a==b){
                CountA++;
                continue;
            }
             A.append(a);
             B.append(b);
        }
        for (int i = 0; i < A.length();i++ ) {
            for (int i1 = 0; i1 < B.length(); ) {
                if (A.charAt(i)==B.charAt(i1)) {
                    CountB++;
                    B.deleteCharAt(i1);
                  break;
                }
                i1++;
            }
        }
        String string = CountA+"A"+CountB+"B";
        return string;
    }
}
