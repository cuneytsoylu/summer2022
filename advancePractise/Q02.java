package advancePractise;

import java.util.Arrays;

public class Q02 {
    /*

Bir array , integer bir "k" değeri ve eşik değeri olarakda integer "thereshold" değeri verilecek, "k" boyutunda
ve elemanlarının ortalaması eşik değerinden büyük veya ona eşit olan kaç adet alt-dizilerin olduğunu ve
bu alt dizileri ekrana yazdıran bir metod oluşturunuz.
Not: yeni oluşacak elemanlar, ilk diziden seçilirken arka arkaya sıralı gelmeli.

Örnek :

Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold(eşik) = 4
Output: 3

 */




        public static void main(String[] args) {
            int[] arr = {2,2,2,2,5,5,5,8};
            int k= 3;
            int threshold = 4;
            System.out.println(numOfSubArrays(arr, k, threshold));


        }

        public static int numOfSubArrays(int[] arr, int k, int threshold) {

            int[] arr2 = new int[k];
            int sum = 0;
            int count =0;


            for(int i=0 ; i< arr.length ; i++) {
                if(i==arr.length-(k-1)) break ;

                System.arraycopy(arr,i,arr2,0,k);
                for(int j=0 ; j < k ; j++){
                    sum += arr2[j];

                }

                if(sum>= threshold*k) {
                    count++;
                    System.out.println(Arrays.toString(arr2));

                }

                sum=0;
            }

            return count;


        }


    }
 /*   Arkadaşlar diğer sorularıda gönderiyorum :
        3.SORU :
        Kullanıcıdan 2 sayı girmesini isteyeceğiz, girilen bu değerlerden biri saati diğeri de dakikayı temsil edecek.
        bize akrep ile yelkovan arasındaki küçük açıyı hesaplayıp değeri açısal olarak döndüren metodu yazınız
        Örnek :
        input : hour : 12,  minutes : 30
        Output: 165


        4.SORU :


En Varlıklı Müşteriyi Bulma :
m x n boyutlarında integer bir dizi verilecek, accounts[i][j] değeri bize i.müşterinin j bankasındaki
parasının miktarını tutacak, Böyle bir yapıda oluşan dizideki en zengin müşterinin hesaplarındaki para miktarını
döndüren maximumWealth isminde bir metod yazınız.
Input   : {{1,2,4},{3,2,1}}
Output  : 7


        5.SORU :


Verilen bir integer dizisinde, içindeki sıfırların hepsini dizinin en sonuna taşıyan ve
diğer değerlerinde sıralamasını bozmdan oluşan diziyi ekrana bastıran bir metod oluşturunuz
Örnek :
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]


        6.SORU :


Bir ürün yöneticisisiniz ve şu anda yeni bir ürün geliştirmek için bir ekibe liderlik ediyorsunuz. Ne yazık ki,
ürününüzün en son sürümü kalite kontrolünden geçemedi. Her sürüm temel alınarak geliştirildiğinden
önceki sürümde, kötü bir sürümden sonraki tüm sürümler de kötüdür.
Diyelim ki n sürümünüz var [1, 2, ..., n] ve ilk kötü olanı bulmak istiyorsunuz,
bu da aşağıdakilerin hepsinin kötü olmasına neden olur.
isBadVersion(version) metod ile ilgili sürümün kötü olup olmadığını dönen bir metod oluşturun ve ekrana
İlk kötü sürümü yazan bir metod oluşturun.
Örnek :
Input: n = 5, bad = 4
Output: 4
Açıklama:
    isBadVersion(3) -> false
    isBadVersion(5) -> true
    isBadVersion(4) -> true
Ozaman 4. sürüm ilk kötü sürümdür

*/