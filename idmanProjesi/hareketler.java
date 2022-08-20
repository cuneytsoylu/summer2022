package idmanProjesi;

public class hareketler {

  private int burpeeSayısı;
  private int pushupSayısı;
  private int situpSayısı;
  private int squatSayısı;


  protected hareketler(int burpeeSayısı, int pushupSayısı, int situpSayısı, int squatSayısı) {
    this.burpeeSayısı = burpeeSayısı;
    this.pushupSayısı = pushupSayısı;
    this.situpSayısı = situpSayısı;
    this.squatSayısı = squatSayısı;
  }


  public void hareketYap(String hareketTuru, int sayi) {
    if (hareketTuru.equals("burpee")) {
      burpeeYap(sayi);


    } else if (hareketTuru.equals("pushup")) {

      pushYap(sayi);

    } else if (hareketTuru.equals("situp")) {

      situpYap(sayi);


    } else if (hareketTuru.equals("squat")) {

     squatYap(sayi);


    }else {
      System.out.println("gecersiz hareket");
    }


  }

  public void burpeeYap(int sayi){
    if (burpeeSayısı==0){
      System.out.println("yapacak burpee kalmadı");

    }if (burpeeSayısı-sayi<0){
      System.out.println("hedefledigin burpee geçtin tebrikler ");
    }else{
      burpeeSayısı-=sayi;
      System.out.println("Kalan burpee sayisi : "+ burpeeSayısı);
    }

  }


  public void pushYap(int sayi){
    if (pushupSayısı==0){
      System.out.println("yapacak pushup kalmadı");

    }if (pushupSayısı-sayi<0){
      System.out.println("hedefledigin  pushup geçtin ");
      pushupSayısı=0;
      System.out.println("Kalan  pushup : "+ pushupSayısı);
    }else{
      pushupSayısı-=sayi;
      System.out.println("Kalan  pushup sayisi : "+ pushupSayısı);
    }

  }
  public void situpYap(int sayi){
    if (situpSayısı==0){
      System.out.println("yapacak situp kalmadı");

    }if (situpSayısı-sayi<0){
      System.out.println("hedefledigin situp geçtin ");
      situpSayısı=0;
      System.out.println("Kalan situp : "+ situpSayısı);
    }else{
      situpSayısı-=sayi;
      System.out.println("Kalan situp sayisi : "+ situpSayısı);
    }

  }
  public void squatYap(int sayi){
    if (squatSayısı==0){
      System.out.println("yapacak squat kalmadı");

    }if (squatSayısı-sayi<0){
      System.out.println("hedefledigin squat geçtin ");
      squatSayısı=0;
      System.out.println("Kalan squat : "+ squatSayısı);
    }else{
      squatSayısı-=sayi;
      System.out.println("Kalan squat sayisi : "+ squatSayısı);
    }

  }

  public boolean idmanBittiMi(){
    return (burpeeSayısı==0)&&(pushupSayısı==0)&&(situpSayısı==0)&&(squatSayısı==0);


  }

}