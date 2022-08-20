package mp3calma;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class mp3cal {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        File file = new File("src/mp3calma/GOOBA.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        String yanıt="";


while(!yanıt.equals("Q")){
    System.out.println("Play icin P ye basiniz\n" +
            "Stop icin S ye\n"+
            "bastan oynatmak icin R ye basiniz\n" +
            "Cikmak icin Q ya basiniz");
    System.out.println("Seciminizi yapiniz");
    yanıt = scanner.next();
    yanıt=yanıt.toUpperCase();

    switch (yanıt){
        case"P":clip.start();
           break;

           case"S":clip.stop();
        break;

        case"R":clip.setMicrosecondPosition(0);
        break;

        case"Q":clip.close();
        break;
        default:
            System.out.println("gecersiz secenek girdiniz");
    }
}

        System.out.println("keyifli günler dileriz");

    }
}