package tr.com.mcay.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class OgrenciService implements IOgrenciService {
    private List<Ogrenci> tumOgrenciler;

    public OgrenciService() {
        tumOgrenciler = new ArrayList<>();
        // Örnek veri
        tumOgrenciler.add(new Ogrenci(1, "Ali", "Yılmaz", 20));
        tumOgrenciler.add(new Ogrenci(2, "Ayşe", "Kaya", 21));
        tumOgrenciler.add(new Ogrenci(3, "Mehmet", "Demir", 22));
        tumOgrenciler.add(new Ogrenci(4, "Fatma", "Çelik", 23));
        tumOgrenciler.add(new Ogrenci(5, "Ahmet", "Öztürk", 24));
    }

    @Override
    public Ogrenci getOgrenciBilgileri(int id) {
        System.out.println("OgrenciService: Veritabanından öğrenci bilgileri getiriliyor...");
        
        // Veritabanı erişimini simüle etmek için biraz bekleme
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        for (Ogrenci ogrenci : tumOgrenciler) {
            if (ogrenci.getId() == id) {
                return ogrenci;
            }
        }
        return null;
    }
} 