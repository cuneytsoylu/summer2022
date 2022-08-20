package radyoProjesi;

import java.util.ArrayList;

public class Ekleme {
  private   String isim;
   private String frekans;


    public Ekleme(String isim, String frekans) {
        this.isim = isim;
        this.frekans = frekans;

    }

    public Ekleme() {

    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getFrekans() {
        return frekans;
    }

    public void setFrekans(String frekans) {
        this.frekans = frekans;
    }

    @Override
    public String toString() {
        return "Kanal ismi=" + isim +" "+
                "Kanal frekansi=" + frekans;

    }


    public Ekleme silme(String sil) {

        return null;
    }
}
