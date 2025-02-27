package tr.com.mcay.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class EnvanterYoneticisi {
    private List<ElektronikUrun> urunler = new ArrayList<>();

    public static void main(String[] args) {
        EnvanterYoneticisi yonetici = new EnvanterYoneticisi();
        
        // Orijinal ürünleri oluştur
        ElektronikUrun laptop = new ElektronikUrun(1, "Laptop", 15000.0);
        ElektronikUrun telefon = new ElektronikUrun(2, "Telefon", 5000.0);
        
        // Ürünleri ekle
        yonetici.urunEkle(laptop);
        yonetici.urunEkle(telefon);
        
        // Ürünlerin klonlarını oluştur ve ekle
        ElektronikUrun laptopKlon = (ElektronikUrun) laptop.clone();
        ElektronikUrun telefonKlon = (ElektronikUrun) telefon.clone();
        laptopKlon.setSatisFiyati(16000);
        telefonKlon.setSatisFiyati(4500);
        yonetici.urunEkle(laptopKlon);
        yonetici.urunEkle(telefonKlon);
        
        // Tüm ürünleri listele
        yonetici.urunleriListele();
    }

    public void urunEkle(ElektronikUrun urun) {
        urunler.add(urun);
    }

    public void urunleriListele() {
        System.out.println("Envanterdeki Ürünler:");
        for (ElektronikUrun urun : urunler) {
            System.out.println("Ürün Kodu: " + urun.getUrunKodu() + 
                               ", Ürün Adı: " + urun.getUrunAdi() + 
                               ", Satış Fiyatı: " + urun.getSatisFiyati() + " TL");
        }
    }
} 