package calısma;

import java.util.Arrays;

public class eksiksayiyibulma {

        public static void main(String[] args) {
            int[] input = {7, 5, 1, 2, 4, 6, 8, 3, 9};
            arrayIcindeEksikElementiBulma(input);
        }
        public static int[] arrayIcindeEksikElementiBulma( int[] input) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            Arrays.sort(input);
            int [] eksikEleman=new int[1];
            for (int i = 0; i <arr.length ; i++) {
                if (Arrays.binarySearch(input, arr[i])<0) {
                    eksikEleman[0]=arr[i];
                }
            }
            System.out.println(Arrays.toString(eksikEleman));
            return eksikEleman;

            /*
            int arr[] = {1, 2, 3, 5, 6, 7, 8, 10, 9};
        int arr1[] = {7, 2, 3, 10, 5, 9, 1, 4, 8};
        int arr2[] = {7, 5, 1, 2, 4, 6, 8, 3, 9};
        int toplam=0;
        int toplamArr=55;
        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i];
        }
        System.out.println("Arrayin kayip elemani : " + (toplamArr-toplam));
             */

        }
    }



