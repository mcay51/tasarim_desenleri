package tr.com.mcay.structural.facade;

/**
 * KrediFacade sınıfı, karmaşık alt sistemleri (Banka, MerkezBanka, Kredi) 
 * tek bir arayüz arkasında gizleyerek kullanımı kolaylaştırır.
 */
public class KrediFacade {
    
    private Banka banka;
    private MerkezBanka merkezBanka;
    private Kredi kredi;
    
    /**
     * KrediFacade sınıfının yapıcı metodu
     */
    public KrediFacade() {
        this.banka = new Banka();
        this.merkezBanka = new MerkezBanka();
        this.kredi = new Kredi();
    }
    
    /**
     * Müşterinin kredi kullanıp kullanamayacağını kontrol eder
     * 
     * @param musteriNo Müşteri numarası
     * @return Kredi kullanabilirse true, kullanamazsa false
     */
    public boolean krediKullanilabilirMi(String musteriNo) {
        System.out.println("KrediFacade: " + musteriNo + " numaralı müşteri için kredi kullanılabilirlik kontrolü yapılıyor...");
        
        // Banka üzerinden kredi borcu kontrolü
        boolean krediBorcuVar = banka.krediBorcuVarMi(musteriNo);
        if (krediBorcuVar) {
            System.out.println("Müşterinin ödenmemiş kredi borcu bulunmaktadır.");
            return false;
        }
        
        // Merkez Bankası üzerinden kara liste kontrolü
        boolean karalistedeVar = merkezBanka.karalisteKontrol(musteriNo);
        if (karalistedeVar) {
            System.out.println("Müşteri kara listede bulunmaktadır.");
            return false;
        }
        
        // Kredi skoru kontrolü
        int krediSkoru = krediSkoruHesapla(musteriNo);
        if (krediSkoru < 500) {
            System.out.println("Müşterinin kredi skoru yetersizdir: " + krediSkoru);
            return false;
        }
        
        System.out.println("Müşteri kredi kullanabilir. Kredi skoru: " + krediSkoru);
        return true;
    }
    
    /**
     * Müşterinin kredi skorunu hesaplar
     * 
     * @param musteriNo Müşteri numarası
     * @return Hesaplanan kredi skoru
     */
    public int krediSkoruHesapla(String musteriNo) {
        System.out.println("KrediFacade: " + musteriNo + " numaralı müşteri için kredi skoru hesaplanıyor...");
        
        // Hesap bilgilerini getir
        banka.hesapBilgileriniGetir(musteriNo);
        
        // Kredi geçmişini getir
        kredi.krediGecmisiGetir(musteriNo);
        
        // Merkez Bankası kişisel skoru
        int merkezBankasiSkoru = merkezBanka.kisiselSkor(musteriNo);
        
        // Kredi skoru
        int krediKurulusuSkoru = kredi.krediSkoru(musteriNo);
        
        // Toplam skor hesaplama (örnek bir hesaplama)
        int toplamSkor = (int) (krediKurulusuSkoru * 0.7 + merkezBankasiSkoru * 3);
        
        System.out.println("Hesaplanan toplam kredi skoru: " + toplamSkor);
        return toplamSkor;
    }
} 