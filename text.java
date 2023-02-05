public class text {
    public static void main(String[] args) {
        int x = 123321;

        String a = x + "";
        char chars[] = a.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - i-1]) {
                System.out.println(false);
            }else if(chars[i] == chars[chars.length - i-1]){
                System.out.println("I"+chars[i]);
                System.out.println("L"+chars[chars.length-i-1]);
            }
        }
    }
}
