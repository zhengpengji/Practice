public class lengthWord58 {
    public static void main(String[] args) {
        String s = " fly me to  the moom ";
        int last =0;
        int first = 0;
            for (int i1 =s.length()-1; i1>=0; i1--) {
                if (s.charAt(i1)!=' '){
                      last=i1;
                    System.out.println(last);
                    break;
                }
            }
        for (int i1 =last-1; i1>=0; i1--) {
            if (s.charAt(i1)==' '){
                first=i1;
                System.out.println(first);
                break;
            }
        }




    }

    public int lengthOfLastWord(String s) {
        int last =0;
        int first = 0;
        for (int i1 =s.length()-1; i1>=0; i1--) {
            if (s.charAt(i1)!=' '){
                last=i1;
                System.out.println(last);
                break;
            }
        }
        for (int i1 =last-1; i1>=0; i1--) {
            if (s.charAt(i1)==' '){
                first=i1;
                System.out.println(first);
                break;
            }


        }int C = last-first;
        if (C==0) {return 1;
        }
        return C;
    }
}






