package radyoProjesi;

import javax.sound.sampled.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static radyoProjesi.YoneticiGiris.yonetici;

public class KullaniciGiris {
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

    static Scanner scan=new Scanner(System.in);
  static  String yanit="";

    public static void giris() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {


        String giris = "\n" +
                "******************************TREN FM******************************\n" +
                "\n" +
                "1 : KULLANICI GIRISI ICIN \n" +
                "2 : YONETICI GIRISI ICIN\n" +
                "3 : CIKMAK ICIN ";
        System.out.println(ANSI_CYAN +giris);

        yanit = scan.next();
        switch (yanit) {
            case "1":
                kullaniciGiris();
                break;
            case "2":
                yonetici();
                break;
            case "3":
                System.out.println("TREN FM KEYIFLI GUNLER DILER");
                break;

            default: {
                System.out.println("GECERSIZ BIR GIRIS YAPTINIZ");
                giris();

            }

        }

    }


    public static void kullaniciGiris() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {

        String kullanici="DINLEMEK ISTEDIGINIZ KANALI SECINIZ\n"+
                "1 : POWER TURK FM \n"+
                "2 : SLOW TURK FM \n"+
                "3 : VIRGIN RADIO \n"+
                "4 : METRO FM \n";
        System.out.println(ANSI_GREEN +kullanici);
        String yanıt=scan.next();
        switch (yanıt) {
            case "1":
                powerTurk();
                break;
            case"2":
                slowTurk();
                break;
            case "3":
                virginRadio();
                break;
            case "4":
                metroFM();
                break;
            default:{
                System.out.println("GECERSIZ BIR RADYO KANALI GIRDINIZ");
            }

        }


    }

    public static void powerTurk() throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {
        File file=new File("src/radyoProjesi/ezhel.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
        Clip clip= AudioSystem.getClip();
        clip.open(audioStream);

//import javax.sound.sampled.*;
        while (!yanit.equals("5")) {

            System.out.println(ANSI_BLUE+"1 : OYNAT \n"+
                    "2 : DUR \n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 : KANAL LISTESI: \n"+
                    "5 : ANA MENU");

            System.out.println("LUTFEN SECIMINIZI YAPINIZ");
            yanit=scan.next();

            switch (yanit) {
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.close();
                    kullaniciGiris();
                    break;
                case "5":
                    clip.close();
                    giris();
                    break;
                default:{
                    System.out.println("GECERSIZ BIR YANIT GIRDINIZ\nTEKRAR SECIM YAPMAK ICIN LUTFEN BEKLEYINIZ");
                }
                Thread.sleep(2000);
            }
        }
    }
    public static void slowTurk() throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {

        File file=new File("src/radyoProjesi/Zeynep Bastık Ara.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
        Clip clip= AudioSystem.getClip();
        clip.open(audioStream);



        while (!yanit.equals("5")) {

            System.out.println(ANSI_BLUE+"1 : OYNAT \n"+
                    "2 : DUR \n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 : KANAL LISTESI: \n"+
                    "5 : ANA MENU");

            System.out.println("LUTFEN SECIMINIZI YAPINIZ");
            yanit=scan.next();

            switch (yanit) {
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.close();
                    kullaniciGiris();
                    break;
                case "5":
                    clip.close();
                    giris();
                    break;
                default:{
                    System.out.println("GECERSIZ BIR YANIT GIRDINIZ\nTEKRAR SECIM YAPMAK ICIN LUTFEN BEKLEYINIZ");
                }
                Thread.sleep(2000);

            }
        }
    }
    public static void virginRadio() throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {

        File file=new File("src/radyoProjesi/PAnda.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
        Clip clip= AudioSystem.getClip();
        clip.open(audioStream);



        while (!yanit.equals("5")) {

            System.out.println(ANSI_BLUE+"1 : OYNAT \n"+
                    "2 : DUR \n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 : KANAL LISTESI: \n"+
                    "5 : ANA MENU");

            System.out.println("LUTFEN SECIMINIZI YAPINIZ");
            yanit=scan.next();

            switch (yanit) {
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.close();
                    kullaniciGiris();
                    break;
                case "5":
                    clip.close();
                    giris();
                    break;
                default:{
                    System.out.println("GECERSIZ BIR YANIT GIRDINIZ\nTEKRAR SECIM YAPMAK ICIN LUTFEN BEKLEYINIZ");
                }
                Thread.sleep(2000);
            }
        }
    }

    public static void metroFM() throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {

        File file=new File("src/radyoProjesi/the moon.wav");
        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
        Clip clip= AudioSystem.getClip();
        clip.open(audioStream);



        while (!yanit.equals("5")) {

            System.out.println(ANSI_BLUE+"1 : OYNAT \n"+
                    "2 : DUR \n"+
                    "3 : BASTAN OYNAT\n"+
                    "4 : KANAL LISTESI: \n"+
                    "5 : ANA MENU");

            System.out.println("LUTFEN SECIMINIZI YAPINIZ");
            yanit=scan.next();

            switch (yanit) {
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.close();
                    kullaniciGiris();
                    break;
                case "5":
                    clip.close();
                    giris();
                    break;
                default:{
                    System.out.println("GECERSIZ BIR YANIT GIRDINIZ\nTEKRAR SECIM YAPMAK ICIN LUTFEN BEKLEYINIZ");
                }
                Thread.sleep(2000);
            }
        }
    }




}

