package tr.com.mcay.structural.facade;

/**
 * Kredi sınıfı, müşterilerin kredi geçmişi ve kredi skoru ile ilgili işlemleri yapar.
 */
public class Kredi {
    
    /**
     * Müşterinin kredi geçmişini getirir
     * 
     * @param musteriNo Müşteri numarası
     */
    public void krediGecmisiGetir(String musteriNo) {
        System.out.println("Kredi: " + musteriNo + " numaralı müşterinin kredi geçmişi getiriliyor...");
        // Kredi geçmişi getirme işlemleri burada yapılır
    }
    
    /**
     * Müşterinin kredi skorunu hesaplar
     * 
     * @param musteriNo Müşteri numarası
     * @return Kredi skoru (0-1500 arası)
     */
    public int krediSkoru(String musteriNo) {
        System.out.println("Kredi: " + musteriNo + " numaralı müşterinin kredi skoru hesaplanıyor...");
        // Gerçek uygulamada kredi geçmişi ve ödeme alışkanlıkları değerlendirilerek hesaplanır
        return 1000; // Örnek bir skor
    }
} 