package tr.com.mcay.creational.builder.innerclass;

public class Client {
    public static void main(String[] args) {
        // İlk kişi - constructor parametreleri ile
        Kisi kisi1 = new Kisi.Builder("Ahmet", "Yılmaz")
            .yas(30)
            .adres("İstanbul")
            .telefon("555-1234567")
            .build();
        
        // İkinci kişi - fluent API ile
        Kisi kisi2 = new Kisi.Builder()
            .ad("Ayşe")
            .soyad("Demir")
            .yas(25)
            .build();
        
        // Kişileri yazdır
        System.out.println("Kişi Bilgileri:");
        System.out.println("Ad: " + kisi1.getAd());
        System.out.println("Soyad: " + kisi1.getSoyad());
        System.out.println("Yaş: " + kisi1.getYas());
        System.out.println("Adres: " + kisi1.getAdres());
        System.out.println("Telefon: " + kisi1.getTelefon());
        
        System.out.println("\nKişi Bilgileri:");
        System.out.println("Ad: " + kisi2.getAd());
        System.out.println("Soyad: " + kisi2.getSoyad());
        System.out.println("Yaş: " + kisi2.getYas());
        System.out.println("Adres: " + kisi2.getAdres());
        System.out.println("Telefon: " + kisi2.getTelefon());
    }
} 