package ders1_intro_14_9_2022.if_Else_Statements_Bloklari;

public class Oy_Kullanim_Uygunlugu {

    public static void main(String[] args) {

        /*
        Örnek:
        Yaş değeri olarak bir sayı verisi verildiğinde (int),
        bu sayının yani yaşın oy kullanımı için uygun olup olmadığını kontrol eden bir program yazınız.
         */

        //Yaş değeri olarak bir sayı tanımlası yapar.
        int age = 21;

        //Koşula göre oy kullanimina uygunluk şartını oluşturur.
        //Eğer int age; ifadesi 18den büyük veya eşit olursa ifade true döner.
        boolean oyKullanimaUygunlukSarti = age >= 18;

        if (oyKullanimaUygunlukSarti){ //Yukarıda verilen veri ve veri şartına göre durumu kontrol eder. Yukarıdaki duruma göre ifade true döner.
            System.out.println("Oy kullanabilir."); //İfade true döndüğü için konsola "Oy kullanabilir." yazısı yazdırılır.
        } else { //Eğer önceki if ifadesi false dönseydi buradaki durum kontrol edilirdi.
            System.out.println("Oy kullanamaz.");
        }

        // System.exit(); kodu mevcut programı sonlandırır.
        System.exit(0); // Status'e 0 değeri verilmesi, programın düzgün bir şekilde çalışıp sonlandırıldığını ifade eder.

    }
}
