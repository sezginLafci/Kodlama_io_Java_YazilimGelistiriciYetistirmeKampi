package ders1_intro_14_9_2022.if_Else_Statements_Bloklari;

public class Ogrenim_Duzeyi {

    public static void main(String[] args) {

        /*
        Örnek:
        Öğrenim düzeyi (sınıf seviyesi) olarak bir sayı verisi verildiğinde (int),
        bu sayının hangi öğrenim düzeyine ait olduğunu kontrol eden bir program yazınız.

        Not: Verilen sayı verisi 1 ile 18 arasında olmak zorundadır. Bu sayı aralığında olmayan veriler geçersizdir.

        1-4: İlkokul
        5-8: Ortaokul
        9-12: Lise
        13-16: Üniversite
        17-18: Yüksek Lisans
         */

        int kacinciSinif = 18; // Bir sayı verisi tanımlanır.

        // && --> Program akışını kontrol edebilmek için kullanılan mantıksal operatörlerden biridir.
        // && --> Ve (and) şartını ifade etmek için kullanılır.
        // || --> Veya (or) şartını ifade etmek için kullanılır. Aşağıda yazmış olduğumuz kodlarda kullanılmasa da belirtmek istedim.
        if (kacinciSinif >= 1 && kacinciSinif <= 18) { // Eğer (kacinciSinif değeri 1 ve 18 arasında ise) bu bloktaki kodları çalıştırır.

            boolean ilkokul = kacinciSinif >= 1 && kacinciSinif <= 4; // kacinciSinif değeri 1 ve 4 arasında ise: İlkokul değeri true
            boolean ortaokul = kacinciSinif >= 5 && kacinciSinif <= 8; // kacinciSinif değeri 5 ve 8 arasında ise: Ortaokul değeri true
            boolean lise = kacinciSinif >= 9 && kacinciSinif <= 12; // kacinciSinif değeri 9 ve 12 arasında ise: Lise değeri true
            boolean universite = kacinciSinif >= 13 && kacinciSinif <= 16; // kacinciSinif değeri 13 ve 16 arasında ise: Üniversite değeri true
            boolean yuksekLisans = kacinciSinif >= 17 && kacinciSinif <= 18; // kacinciSinif değeri 17 ve 18 arasında ise: Yükseklisans değeri true döner.

            String ogrenimDuzeyi = ""; //Daha sonra kod akışında tekrar kullanılabilmesi ve tanımlama yapılabilmesi için boş bir String veri tanımlaması yapar.

            if (ilkokul) { // Eğer ilkokul şartı true dönerse
                ogrenimDuzeyi = "İlkokul"; //ogrenimDuzeyi verisi "İlkokul" olarak tanımlanır.
            } else if (ortaokul) { // Eğer ortaokul şartı true dönerse
                ogrenimDuzeyi = "Ortaokul"; //ogrenimDuzeyi verisi "Ortaokul" olarak tanımlanır.
            } else if (lise) { // Eğer lise şartı true dönerse
                ogrenimDuzeyi = "Lise"; //ogrenimDuzeyi verisi "Lise" olarak tanımlanır.
            } else if (universite) { // Eğer üniversite şartı true dönerse
                ogrenimDuzeyi = "Üniversite"; //ogrenimDuzeyi verisi "Üniversite" olarak tanımlanır.
            } else { // Eğer hiçbiri true dönmezse
                ogrenimDuzeyi = "Yüksek Lisans"; //ogrenimDuzeyi verisi "Yüksek Lisans" olarak tanımlanır.
            }

            // Konsola şartlara ve durumlarına göre tanımlanan öğrenim düzeyini yazdırır.
            System.out.println("Öğrenim düzeyi: " + ogrenimDuzeyi);

            // System.exit(); kodu mevcut programı sonlandırır.
            System.exit(0); // Status'e 0 değeri verilmesi, programın düzgün bir şekilde çalışıp sonlandırıldığını ifade eder.

        } else { //Eğer (kacinciSinif değeri 1'den küçük veya 18'den büyük ise) bu bloktaki kodları çalıştırır.
            // System.err.println(""); kodu System.out kodundan farklı olarak konsola kırmızı renkte yazdırma işlemi yapar.
            // Genellikle hata measajları için kullanılır.
            System.err.println("Geçersiz sınıf seviyesi.");
            System.exit(1); // Status'e 1 değeri verilirse, programın düzgün bir şekilde çalışmayıp sonlandırılığını, hatalı olduğunu ifade eder.
        }

    }
}
