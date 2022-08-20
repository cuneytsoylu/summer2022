package interfaceUcusProje;

public class Ucus {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*********************ADANA SAKİRPASA HAVALİMANİNA HOSGELDİNİZ*********************");

        String sartlar="Yurtdisi Cikis Kurallari\n"+
                "Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor?\n" +
                "200 tl harc bedelinizi tam olarak yatirmaniz gerekiyor\n" +
                "Gideceginiz ulkeye vizenizin bulunmasi gerekiyor...";

        String mesaj="YURTDISI CİKİS SARTLARİNİN HEPSİNİ SAGLAMANİZ GEREKİYOR";


while (true) {
    System.out.println("");
    System.out.println(sartlar);

    Yolcu yolcu=new Yolcu();

    System.out.println("Harc Bedeli Kontrol Ediliyor...");

    Thread.sleep(3000);

  if(yolcu.yurtdisiHarciKontrol()==false){
      System.out.println(mesaj);
      break;
      //continue; //break;  //continue yaparsak direk döngünün en başına gider

  }
    System.out.println("Siyasi yasaginiz kontrol ediliyor...");
  Thread.sleep(3000);

  if(yolcu.siyasiYasakKontrol()==false){
      System.out.println(mesaj);
      break;
      //continue; //break;  //continue yaparsak direk döngünün en başına gider
  }
    System.out.println("Vize durumununuz kontrol ediliyor...");
  Thread.sleep(3000);

  if (yolcu.vizeDurumuKontrol()==false){
      System.out.println(mesaj);
      break;
      //continue; //break;  //continue yaparsak direk döngünün en başına gider
  }
    System.out.println("İSLEMLERİNİZ TAMAM! YURTDİSİNA CİKABİLİRSİNİZ...");
  break;
}



    }
}
