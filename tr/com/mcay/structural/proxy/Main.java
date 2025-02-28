package tr.com.mcay.structural.proxy;

public class Main {
    public static void main(String[] args) {
        IOgrenciService ogrenciService = new OgrenciServiceProxy();

        // İlk istek - cache'de olmadığı için gerçek servise gidecek
        System.out.println("İlk istek için öğrenci #1:");
        Ogrenci ogrenci1 = ogrenciService.getOgrenciBilgileri(1);
        System.out.println(ogrenci1);
        System.out.println();

        // İkinci istek - cache'den gelecek
        System.out.println("İkinci istek için öğrenci #1:");
        Ogrenci ogrenci1Tekrar = ogrenciService.getOgrenciBilgileri(1);
        System.out.println(ogrenci1Tekrar);
        System.out.println();

        // Farklı bir öğrenci - cache'de olmadığı için gerçek servise gidecek
        System.out.println("İlk istek için öğrenci #3:");
        Ogrenci ogrenci3 = ogrenciService.getOgrenciBilgileri(3);
        System.out.println(ogrenci3);
        System.out.println();

        // Olmayan bir öğrenci
        System.out.println("Olmayan öğrenci #10:");
        Ogrenci olmayanOgrenci = ogrenciService.getOgrenciBilgileri(10);
        System.out.println(olmayanOgrenci);
    }
} 