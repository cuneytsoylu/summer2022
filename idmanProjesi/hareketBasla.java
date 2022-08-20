package idmanProjesi;

import java.util.Scanner;

public class hareketBasla {
    public static void main(String[] args) throws InterruptedException {


Scanner scan=new Scanner(System.in);

        System.out.println("idman programına hosgeldiniz");

String idmanlar="Geçerli hareketler....\n"+
                 "burpee\n"+
                 "pushup\n"+
                 "situp\n"+
                 "squat\n";
        System.out.println(idmanlar);

        System.out.println("bir idman olusturun....");
        System.out.print("burpee sayisi : ");
        int burpee=scan.nextInt();
        System.out.print("pushup sayisi : ");
        int pushup=scan.nextInt();
        System.out.print("situp sayisi : ");
        int situp=scan.nextInt();
        System.out.print("squat sayisi : ");
        int squat=scan.nextInt();

             hareketler program=new hareketler(burpee,  pushup,  situp,  squat);
        System.out.println("idmanınız baslıyor.....");

        Thread.sleep(3000);


        while (program.idmanBittiMi()==false){
            scan.nextLine();
            System.out.print("Hareket turu(burpee,pushup,situp,squat) : ") ;
            String tur=scan.nextLine();
            System.out.print("bu hareketten kac adet yapacaksınız : ");
            int sayi=scan.nextInt();

program.hareketYap(tur,sayi);


        }

        System.out.println("idmanini basariyla bitirdin");
    }
}
