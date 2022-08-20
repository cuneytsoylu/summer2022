package calısma;

import java.util.ArrayList;
import java.util.List;

public class b {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        countPositivesSumNegative(arr);
    }
    private static int countPositivesSumNegative(int[] arr) {
       int yenisayi=0;
        int count =0;
        int toplam =0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>0){
                count++;
            }else if (arr[i]<0)
                toplam+=arr[i];
        }
        List<Integer> yeni=new ArrayList<>();
        yeni.add(count);
        yeni.add(toplam);
        System.out.print(yeni);


        return yenisayi;
    }
}
