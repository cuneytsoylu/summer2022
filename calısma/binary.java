package calısma;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("binary bir girin");
        int b1=scan.nextInt();
        System.out.println("binary iki girin");
        int b2=scan.nextInt();

        int[]arr=new int[10];
        int kalan=0;
        int uzunluk=0;
        while(b1!=0&&b2!=0){
            arr[uzunluk++]=(b1%10+b2%10+kalan)%2;
            kalan=(b1%10+b2%10+kalan)/2;
            b1/=10;
            b2/=10;
        }
        if (kalan!=0){
            arr[uzunluk++]=kalan;
        }

        System.out.print("sayiların toplami : ");
       --uzunluk;
        while(uzunluk>=0){
            System.out.print(arr[uzunluk--]);
        }
        System.out.println("");

    }
}
