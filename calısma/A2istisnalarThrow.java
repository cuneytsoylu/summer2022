package calısma;

import java.util.Scanner;

public class A2istisnalarThrow {
    public static void main(String[] args) {
/*
throw kendi exception u muzu fırlatacak bir method yapalım
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();
try {
    mekanKontrol(yas);

}catch (ArithmeticException e){
    System.out.println("yasin tutmuyor ama dayin sagolsun gir bakalim...");
}



    }

    private static void mekanKontrol(int yas) {

        if (yas<18){                                                                          //boyle bir durumda ben bir exception olusmasini istiyorum
          throw new ArithmeticException();    //unchecked exception                           // normalde boyle bir durumda exception olusmaz


        }else {
            System.out.println("Mekana hosgeldiniz...");
        }


    }


}
