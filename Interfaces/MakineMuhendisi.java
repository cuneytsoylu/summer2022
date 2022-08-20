package Interfaces;

public class MakineMuhendisi implements IMuhendis,ikinicisi {
private boolean askerlikDurumuSorgula;
private boolean referans;
public MakineMuhendisi(boolean askerlikDurumuSorgula, boolean adliSicilSorgula) {
        this.askerlikDurumuSorgula = askerlikDurumuSorgula;
        this.referans = referans;
    }
    @Override
    public void askerlikDurumuSorgula() {
if (askerlikDurumuSorgula){
    System.out.println("o iş tamam");
}else{
    System.out.println("yakında yapacagım");
}
}
@Override
    public String mezuniyetOrtalamasi(double derece) {

        return "ortalamam : "+derece;
    }
    @Override
    public void referansSorgula() {
        if (referans){
            System.out.println("ben yalnız bir adamım .p");
        }

    }
    @Override public void isTecrubesi(String[] array) {
        System.out.println("daha once su sirketlerde calistim");

        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
}
public static void main(String[] args) {
        MakineMuhendisi muhendis2=new MakineMuhendisi(true,true);

        muhendis2.referansSorgula();
        System.out.println(muhendis2.mezuniyetOrtalamasi(3.58));
        String [] tecrube={"A","B","C","D","E","F","G"};
        muhendis2.isTecrubesi(tecrube);
        muhendis2.rastgele();
    }
    @Override
    public void rastgele() {
        System.out.println("");
        System.out.println("--------------------------------");
    }
}
