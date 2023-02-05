public class Nine {
    public static void main(String[] args) {
        Nine a = new Nine();
        a.isPalindrome(-12321);



    }

    public boolean isPalindrome(int x){
        if(x<0){
            return false;
        }



        if (x>=0){
            String a = x+"";
            char chars[]=a.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(chars[i]!=chars[chars.length-i-1]){
                    return false;
                }
            }

        }



        return true;
    }
}
