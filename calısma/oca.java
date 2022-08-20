package calısma;

public class oca {
    public static void main(String[] args) {
        int ans;
        try {
            int a=10;
            int b=0;
            ans=a/b;
        }catch (ArithmeticException e){
            ans=0;
        }catch (Exception e){
            System.out.println("xs");
        }

    }

}
