package Interfaces;

public class PcMuhendisi implements IMuhendis,ikinicisi{
    private boolean askerlik;
    private boolean referans;
    public PcMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.referans = adliSicil;
    }
    @Override
    public void askerlikDurumuSorgula() {
        if (askerlik) {
            System.out.println("askerligimi yaptim");
        } else {
            System.out.println("askerligimi henuz yapmadim");
        }
    }
    @Override
    public String mezuniyetOrtalamasi(double derece) {

        return "ortalamam : " + derece;

    }
    @Override
    public void referansSorgula() {

        if (referans) {
            System.out.println("referansım bulunuyor");
        } else {
            System.out.println("referansım bulunmuyor");
        }
    }
    @Override
    public void isTecrubesi(String[] array) {
        System.out.println("Bilgisayar Muhendisi olarak Su Sirketlerde Calistim...");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
      //    IMuhendis muhendis1=new IMuhendis();

       IMuhendis muhendis = new PcMuhendisi(false, false);
     ikinicisi muhendis1=new PcMuhendisi(false, false);
            /*
            IMuhendis muhendis1=new PcMuhendisi(false,false); yazabiliriz cunku biz

            interfaceslerden herhangi bir obje olusturamıyoruz ancak onların

referanslarını,onları implement eden classların objelerine referans olarak gösterebiliyoruz demiştik
             */
        muhendis.askerlikDurumuSorgula();
        System.out.println(muhendis.mezuniyetOrtalamasi(3.07));

        String[] tecrube = {"vestel", "Aselsan", "turksat"};

        muhendis.isTecrubesi(tecrube);

        ((PcMuhendisi) muhendis).rastgele(); // cast yaptık

         /*
         biz bir tane de makine muhendisi class i olustursaydık yine aynı degerleri kullanacaktık sadece
         uymak zorunda olacagımız sey double derece olacaktı.

          */
    }

    @Override
    public void rastgele() {
        System.out.println("bunun diyecekleri var");
    }
}