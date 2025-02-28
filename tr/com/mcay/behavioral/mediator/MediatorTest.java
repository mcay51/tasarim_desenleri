package tr.com.mcay.behavioral.mediator;

/**
 * Mediator tasarım deseninin test edilmesi
 */
public class MediatorTest {
    
    public static void main(String[] args) {
        // Mediator nesnesi oluştur
        SohbetOdasi sohbetOdasi = new SohbetOdasi();
        
        // Katılımcıları oluştur
        Kullanici ahmet = new Kullanici("Ahmet", sohbetOdasi);
        Kullanici mehmet = new Kullanici("Mehmet", sohbetOdasi);
        Kullanici ayse = new Kullanici("Ayşe", sohbetOdasi);
        
        // Katılımcıları sohbet odasına ekle
        sohbetOdasi.katilimciEkle(ahmet);
        sohbetOdasi.katilimciEkle(mehmet);
        sohbetOdasi.katilimciEkle(ayse);
        
        // Mesaj gönderme işlemlerini test et
        ahmet.mesajGonder("Herkese merhaba!");
        System.out.println("------------------------");
        
        mehmet.mesajGonder("Merhaba Ahmet, nasılsın?");
        System.out.println("------------------------");
        
        ayse.mesajGonder("Herkese iyi günler!");
        System.out.println("------------------------");
    }
} 