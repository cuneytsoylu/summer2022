package mp3calma;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Scanner;

import static mp3calma.kanalListesi.KanalListesi;
import static mp3calma.kanalListesi.hazırKanallar;

public class anaMenu {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        String giris="******************TREN FM******************";

        String menu="RADYO KANAL AYARLARI ICIN : GO\n"+
                "CIKMAK ICIN : QUITE\n"+
                "GIRINIZ";
        System.out.println(giris);
        System.out.println();
        System.out.println(menu);
        Scanner scan=new Scanner(System.in);
        String secim;
        secim=scan.next();
        if (secim.equals("GO")){
            KanalListesi();
        }else if (secim.equals("QUITE")){
            System.out.println("Keyifli Gunler Dileriz...");
        }
    }
}
