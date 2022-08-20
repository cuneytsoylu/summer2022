package radyoProjesi;


import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

import static radyoProjesi.KullaniciGiris.giris;

public class YoneticiGiris {
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static Scanner scan = new Scanner(System.in);
    static String cevap = "";
    static ArrayList<Ekleme> kanalListesi = new ArrayList<>();


    public static void yonetici() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        String yonetici = "1 : KANAL EKLEME \n" +
                "2 : KANAL SILME\n" +
                "3 : KANAL LISTESI\n" +
                "4 : ANA SAYFA\n" +
                "5 : CIKIS ";
        System.out.println(ANSI_RED_BACKGROUND+yonetici);
        cevap = scan.next();
        switch (cevap) {
            case "1":
                kanalEkleme();
                devamMi();
                yonetici();
                break;
            case "2":
                kanalSil();
                System.out.println("MENUYE YONLENDIRILIYOR...");
                System.out.println();
                Thread.sleep(3000);
                yonetici();
                break;
            case "3":
                kanalListesiGoster();
                System.out.println("MENUYE YONLENDIRILIYOR...");
                System.out.println();
                Thread.sleep(4000);
                yonetici();
                break;
            case "4":
                giris();
                break;
            case "5": {
                System.out.println("TREN FM KEYIFLI GUNLER DILER");
            }

            break;
            default: {
                System.out.println("GECERSİZ BİR DEGER GİRDİNİZ\nTEKRAR GIRMEK ICIN LUTFEN BEKLEYINIZ");
                System.out.println();
            }
            Thread.sleep(2000);
            yonetici();
        }

    }

    private static void kanalListesiGoster() {
        for (Ekleme each : kanalListesi
        ) {
            System.out.println(each);

        }

    }

    private static void kanalSil() {
        if (kanalListesi.isEmpty()) {
            System.out.println("SILINECEK KANAL YOKTUR");
            System.out.println();
        } else {
            System.out.println("SILINECEK KANALLARIN LISTESI");
            System.out.println(kanalListesi);

            //   System.out.println("DEVAM...");

            System.out.println("SILINECEK KANALIN ISMINI GIRINIZ");

            String sil = scan.next();
            for (Ekleme each :kanalListesi
                 ) {
                if (each.getIsim().equalsIgnoreCase(sil)) {
                    kanalListesi.remove(each);
                }

            }
    }


}

    private static void kanalEkleme() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {

        cevap = scan.nextLine();
        System.out.println("EKLEMEK ISTEDIGINIZ KANALIN ADINI GIRINIZ");
        String isim = scan.nextLine();
        System.out.println("EKLEMEK ISTEDIGINIZ KANALIN FREKANSINI GIRINIZ");
        String frekans = scan.nextLine();
        Ekleme kanalEkle = new Ekleme(isim, frekans);
        System.out.println(kanalEkle);
        kanalListesi.add(kanalEkle);

    }
public static boolean devamMi() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        boolean devamMi;
    System.out.println("YENI KANAL EKLEMEK İSTER MISIN\nEKLEMEK ICIN : true\nCIKMAK ICIN : false");
        devamMi=scan.nextBoolean();

        while (!devamMi==false){

            kanalEkleme();
            System.out.println("YENI KANAL EKLEMEK İSTER MISIN\nEKLEMEK ICIN : true\nCIKMAK ICIN : false");

            devamMi=scan.nextBoolean();



        }
return devamMi;
}


    }
