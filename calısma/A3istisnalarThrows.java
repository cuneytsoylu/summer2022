package calısma;

import java.io.IOException;
import java.util.Scanner;

public class A3istisnalarThrows {




        public static void main(String[] args) throws IOException {
/*
throw kendi exception u muzu fırlatacak bir method yapalım
 */

            Scanner scan=new Scanner(System.in);
            System.out.println("lutfen yasinizi giriniz");
            int yas= scan.nextInt();


                mekanKontrol(yas);


        }

        private static void mekanKontrol(int yas) throws IOException{


            if (yas<18){                                                                          //boyle bir durumda ben bir exception olusmasini istiyorum
                throw new IOException();    //unchecked exception                           // normalde boyle bir durumda exception olusmaz


            }else {
                System.out.println("Mekana hosgeldiniz...");
            }

        }


    }

