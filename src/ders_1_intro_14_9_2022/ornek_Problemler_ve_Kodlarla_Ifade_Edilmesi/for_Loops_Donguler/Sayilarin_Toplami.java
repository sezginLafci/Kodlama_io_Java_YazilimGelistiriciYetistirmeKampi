package ders1_intro_14_9_2022.for_Loops_Donguler;

public class Sayilarin_Toplami {

    public static void main(String[] args) {

        /*
        Örnek:
        1 ile tanımlanan herhangi bir pozitif sayı verisi arasındaki tüm sayıların toplamını hesaplayabilen bir program yazınız.

        Tanımlanan sayı verisi: 100
        Çıktısı alınan veri değeri (sayıların toplamı): 5050

        Tanımlanan sayı verisi: 50
        Çıktısı alınan veri değeri (sayıların toplamı): 1275
         */

        int hedefSayi = 1000; // Bir sayı verisi tanımlanır.
        int tumSayilarinToplami = 0;// Daha sonra kod akışında tekrar kullanılabilmesi ve tanımlama yapılabilmesi için 0 değerinde bir int veri tanımlaması yapar.

        if (hedefSayi < 1) { // Eğer (hedefSayı 1'den küçükse) true döner ve bu bloktaki kodlar çalışır.
            System.err.println("Geçersiz sayı."); //Konsola kırmızı renkte hata mesajı verir. --> "Geçersiz sayı"
            System.exit(1); // Programın hatalı olduğunu ifade ederek programı sonlandırır.
        } else { // Eğer (hedefSayı 1 veya 1'den daha büyükse) true döner ve bu bloktaki kodlar çalışır.

            // int i = 0; i'ye değer vermeye 0'dan başlar
            // i <= hedefSayi; i değeri hedef sayıya eşit olana kadar artsın.
            // Nasıl artsın? --> i++ --> 1er 1er artsın.

            for (int i = 0; i <= hedefSayi; i++) {

                tumSayilarinToplami += i; // tumSayilarinToplami = tumSayilarinToplami + i; şeklinde ifade edilir.

                // hedef sayi değeri örneğin 6 olsaydı;
                // 0 + 0 = 0;
                // 0 + 1 == 1;
                // 1 + 2 == 3;
                // 3 + 3 == 6;
                // 6 + 4 == 10;
                // 10 + 5 == 15;
                // 15 + 6 == 21;

            }

            System.out.println(tumSayilarinToplami); // Döngü tamamlandıktan sonra tanımlanam toplam sayı veri değerini konsola yazdırır.
            System.exit(0); // Programın başarılı bir şekilde çalıştığını ifade ederek sonlandırır.

        }
    }
}

