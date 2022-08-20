package calısma;

public class A1istisnalar {
    public static final String S = "\u001B[30m";
    public static final String K = "\u001B[31m";
    public static final String Y = "\u001B[32m";
    public static final String SA = "\u001B[33m";
    public static final String M= "\u001B[34m";
    public static final String MO= "\u001B[35m";
    public static final String TUR= "\u001B[36m";
    public static final String B= "\u001B[37m";

    public static void main(String[] args) {
      //  int a=30/0;// unchecked exception
    //    int [] a={1,2,3,4,5};
     //   System.out.println(a[5]);

      //  System.out.println("burası çalısıyor...");
/*try {
  //  int a=30/0;
    int [] a={1,2,3,4,5};
    System.out.println(a[5]);
}catch (ArrayIndexOutOfBoundsException e){ // Exception   // IndexOutOfBoundsException //RuntimeException //Throwable
   // System.out.println("bir sayı 0 a bolunemez");
    System.out.println("Array in boyunu astiniz");

}

        System.out.println("burasi calisiyor");
*/try { int [] a={1,2,3,4,5};
            System.out.println(a[2]);
            int b=30/10;
            System.out.println(b);

         }catch(ArithmeticException e){
            System.out.println(Y+"bir sayı 0 a bolunemez");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(K+"Array in boyunu astiniz...");

        }catch (Exception e){
            System.out.println(TUR+"bir hata olustu");
        }


        System.out.println(MO+"burasi calisiyor");
    }
}
