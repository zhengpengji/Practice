public class gsf1768 {
    public static void main(String[] args) {

    }
    public static  String mergeAlternately(String word1, String word2) {
               int length = Math.min(word1.length(),word2.length());
        int lengthmax = Math.max(word1.length(),word2.length());
               StringBuilder sb= new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if (word1.length()==word2.length()){
            return sb.toString();
        }
        if (word1.length()>word2.length()){
            for (int i = length; i < lengthmax; i++) {
               sb.append(word1.charAt(i));
            }
            return sb.toString();
        }
        if (word1.length()<word2.length()){
            for (int i = length; i < lengthmax; i++) {
                sb.append(word2.charAt(i));
            }
            return sb.toString();
        }
        return sb.toString();
    }
}
