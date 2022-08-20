package calısma;

public class A4istisnalarExceptionPropagation {

    public static void main(String[] args) {
birincifonksiyon();
    }

    public static void ucuncufonksiyon(){

        int a=12/0;

    }
    public static void ikincifonksiyon(){
        try {
            ucuncufonksiyon();
        }catch (ArithmeticException e){
            System.out.println("bir sayi 0 a bolunemez");
        }

    }
    public static void birincifonksiyon(){
        ikincifonksiyon();
    }
}
