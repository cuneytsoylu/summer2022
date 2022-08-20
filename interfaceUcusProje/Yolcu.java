package interfaceUcusProje;

import java.util.Scanner;

public class Yolcu implements yurtDisiKurallari{
    private int Harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
public Yolcu() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Yatırdiginiz harc bedeli : ");
    this.Harc = scan.nextInt();

    scan.nextLine();

    System.out.println("Herhangibir siyasi yasaginiz bulunuyor mu ? ");
    String cevap = scan.next();

    if (cevap.equals("evet")) {
        this.siyasiYasak = true;
    } else if (cevap.equals("hayir")) {
        this.siyasiYasak = false;
    }


    System.out.println("vizeniz bulunuyor mu ?");
    String cevap2 = scan.next();

    if (cevap2.equals("evet")) {
        this.vizeDurumu = true;

    } else if (cevap2.equals("hayir")) {
        this.vizeDurumu = false;
    }

}

    @Override
    public boolean yurtdisiHarciKontrol() {
if (this.Harc<200){
    System.out.println("lutfen yurtdısı cıkıs harcınızı tam yatırın ");
    return  false;
}else {
    System.out.println("Yurtdisi harci islemi tamam!");
    return true;
}
}

    @Override
    public boolean siyasiYasakKontrol() {
if (this.siyasiYasak==true){
    System.out.println("Siyasi yasaginiz bulunuyor.Yurtdisina cikamazsiniz");
    return false;
}else{
    System.out.println("Siyasi yasaginizi bulunmuyor");
return true;
}
}

    @Override
    public boolean vizeDurumuKontrol() {
    if (this.vizeDurumu==true){
        System.out.println("Vize islemleri tamam");
    return true;

    }else{
        System.out.println("Vizeniz gideceginiz ulkeye bulunmamaktadir");
        return false;
    }
}
}
