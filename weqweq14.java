public class weqweq14 {
    public static void main(String[] args) {

       String[] strs = {"dfedsdf", "dfedrwsdf", "dfswersfd","d"};

        int minlength =strs[0].length();
        for (int i = 0; i < strs.length; i++) {
              minlength=Math.min(strs[i].length(),minlength);
        }
        if (minlength==0){
            System.out.println(minlength);//return ="";
        }
        String max="";
        String max2=strs[0];
        for (int i = 1; i < strs.length; i++) {
            for (int i1 = 0; i1 < minlength; i1++) {
               if (strs[i].charAt(i1)==strs[i-1].charAt(i1)){
                   max=max+strs[i].charAt(i1);
                   System.out.println(max);
               }else {
                   break;
               }
               }

            if (max.length()<max2.length()){
                    max2=max;
            }
            max="";


        }
        System.out.println(max2);


    }
}
