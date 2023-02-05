public class removeDuplicates26 {
     public static void main(String[] args) {
          int[] a ={1,1,1,2,2,2,3,3,4,4,4,5,5,5,6};
          int[] b = new int[a.length];
          b[0]=a[0];
          int j=1;
          for (int i = 1; i < a.length; i++) {
               if (a[i-1]==a[i]) {
                    continue;
               }
               if (a[i-1]!=a[i]){
                    b[j]=a[i];
                    j++;
               }

          }
          for (int i = 0; i < b.length; i++) {
               System.out.print(b[i]);
          }


          System.out.println(j);
          System.out.println(a.length);
     }
}
