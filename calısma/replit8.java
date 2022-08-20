package calısma;

import java.util.Scanner;

public class replit8 {
    public static void main(String[] args) {
        /*
        Ask user for a string and print a new string made of 3 copies of the last 2 letters

The strings length will be at least 2.

Sample:

INPUT : Mustafa OUTPUT : fafafa
         */

Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String str=scan.next();

      /*  if (str.length()>2){
            int son=0;
            while (son<3){
                System.out.print(str.substring(str.length()-2));
son++;}
        }else System.out.println("lutfen en az uc harfli bir isim giriniz");*/

        if (str.length()>2){
            System.out.println(str.substring(str.length() - 2) + str.substring(str.length() - 2) +str.substring( str.length() - 2));

        }else System.out.println("lutfen en az uc harfli bir isim giriniz");

    }
}
