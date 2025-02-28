package tr.com.mcay.structural.facade;

/**
 * MerkezBanka sınıfı, müşterilerin kara liste kontrolü ve kişisel skor hesaplaması yapar.
 */
public class MerkezBanka {
    
    /**
     * Müşterinin kara listede olup olmadığını kontrol eder
     * 
     * @param musteriNo Müşteri numarası
     * @return Kara listede ise true, değilse false
     */
    public boolean karalisteKontrol(String musteriNo) {
        System.out.println("MerkezBanka: " + musteriNo + " numaralı müşteri için kara liste kontrolü yapılıyor...");
        // Gerçek uygulamada merkez bankası API'si ile kontrol yapılır
        return false; // Örnek olarak kara listede olmadığını varsayalım
    }
    
    /**
     * Müşterinin kişisel skorunu hesaplar
     * 
     * @param musteriNo Müşteri numarası
     * @return Kişisel skor (0-100 arası)
     */
    public int kisiselSkor(String musteriNo) {
        System.out.println("MerkezBanka: " + musteriNo + " numaralı müşteri için kişisel skor hesaplanıyor...");
        // Gerçek uygulamada merkez bankası verileri kullanılarak hesaplanır
        return 70; // Örnek bir skor
    }
} 