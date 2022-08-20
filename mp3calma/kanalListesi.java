package mp3calma;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class kanalListesi {
    static Scanner scanner = new Scanner(System.in);

    public static void hazırKanallar() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        String liste = "NUMBER ONE FM : 1\n" +
                       "POWER TURK FM : 2\n" +
                       "SLOW TURK  FM : 3\n" +
                       "RAP HIPHOP FM : 4\n" ;
        System.out.println("LUTFEN DINLEMEK ISTEDIGINIZ KANALI SECINIZ");
        System.out.println(liste);

liste= scanner.next();
        switch (liste){
            case "1" :
                numberoneFm();
                break;
                case "2" :
                    powerTurkFm();
                    break;
            case"3":
                slowturkFm();
                break;
                case "4":
                    raphıphopFm();
                    break;
            default:{
                System.out.println("gecersiz kanal girdiniz");  }

        }
    }

    public static void raphıphopFm() throws UnsupportedAudioFileException, IOException, LineUnavailableException{



        File file = new File("src/mp3calma/GOOBA.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        String yanıt="";


        while(!yanıt.equals("4")){
            System.out.println("OYNAT :1\n" +
                    "DUR :2\n"+
                    "BASTAN OYNAT :3\n" +
                    "CIKIS :4\n"+
                    "KANAL LISTESI :5");
            System.out.println("Seciminizi yapiniz");
            yanıt = scanner.next();
            yanıt=yanıt.toUpperCase();

            switch (yanıt){
                case"1":clip.start();
                    break;

                case"2":clip.stop();
                    break;

                case"3":clip.setMicrosecondPosition(0);
                    break;

                case"4":clip.close();
                    KanalListesi();
                    break;
                case"5":clip.close();
                    hazırKanallar();
                default:
                    System.out.println("gecersiz secenek girdiniz");
            }
        }
    }

    public static void slowturkFm() throws UnsupportedAudioFileException, IOException, LineUnavailableException{


        File file = new File("src/mp3calma/Zeynep Bastık Ara.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        String yanıt="";


        while(!yanıt.equals("4")){
            System.out.println("OYNAT :1\n" +
                    "DUR :2\n"+
                    "BASTAN OYNAT :3\n" +
                    "CIKIS :4\n"+
                    "KANAL LISTESI :5");
            System.out.println("Seciminizi yapiniz");
            yanıt = scanner.next();
            yanıt=yanıt.toUpperCase();

            switch (yanıt){
                case"1":
                    clip.start();
                    break;

                case"2":clip.stop();
                    break;

                case"3":clip.setMicrosecondPosition(0);
                    break;

                case"4":clip.close();
                    KanalListesi();
                    break;
                case"5":clip.close();
                    hazırKanallar();
                default:
                    System.out.println("gecersiz secenek girdiniz");
            }
        }
    }

    public static void numberoneFm() throws UnsupportedAudioFileException, IOException, LineUnavailableException{



        File file = new File("src/mp3calma/PAnda.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        String yanıt="";


        while(!yanıt.equals("4")){
            System.out.println("OYNAT :1\n" +
                    "DUR :2\n"+
                    "BASTAN OYNAT :3\n" +
                    "CIKIS :4\n"+
                    "KANAL LISTESI :5");
            System.out.println("Seciminizi yapiniz");
            yanıt = scanner.next();
            yanıt=yanıt.toUpperCase();

            switch (yanıt){
                case"1":clip.start();
                    break;

                case"2":clip.stop();
                    break;

                case"3":clip.setMicrosecondPosition(0);
                    break;

                case"4":clip.close();
                KanalListesi();
                    break;
                case"5":clip.close();
                    hazırKanallar();
                default:
                    System.out.println("gecersiz secenek girdiniz");
            }
        }
    }

    public static void  powerTurkFm() throws UnsupportedAudioFileException, IOException, LineUnavailableException{


        File file = new File("src/mp3calma/GOOBA.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        String yanıt="";


        while(!yanıt.equals("4")){
            System.out.println("OYNAT :1\n" +
                    "DUR :2\n"+
                    "BASTAN OYNAT :3\n" +
                    "CIKIS :4\n"+
                    "KANAL LISTESI :5");
            System.out.println("Seciminizi yapiniz");
            yanıt = scanner.next();
            yanıt=yanıt.toUpperCase();

            switch (yanıt){
                case"1":clip.start();
                    break;

                case"2":clip.stop();
                    break;

                case"3":clip.setMicrosecondPosition(0);
                    break;

                case"4":clip.close();
                    KanalListesi();
                    break;
                case"5":clip.close();
                    hazırKanallar();

                default:
                    System.out.println("gecersiz secenek girdiniz");
                    }
                }
    }


    public static void kanalEkle() {



    }

    public static void KanalListesi() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        String mevcut="MEVCUT  KANALLAR  ICIN  :1\n"+
                      "YENI KANAL EKLEMEK ICIN :2\n"+
                      "KANAL  SILMEK  ICIN     :3\n"+
                      "KANAL FREKANSLARI  ICIN :4\n";

        System.out.println("LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ");
        System.out.println(mevcut);
        String secim=scanner.next();
       switch (secim) {
           case "1":
               hazırKanallar();
               break;
       }
    }
}