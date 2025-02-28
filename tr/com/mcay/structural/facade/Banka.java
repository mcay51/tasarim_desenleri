package tr.com.mcay.structural.facade;

/**
 * Banka sınıfı, müşteri hesap bilgilerini ve kredi borcu durumunu kontrol eder.
 */
public class Banka {
    
    /**
     * Müşterinin hesap bilgilerini getirir
     * 
     * @param musteriNo Müşteri numarası
     */
    public void hesapBilgileriniGetir(String musteriNo) {
        System.out.println("Banka: " + musteriNo + " numaralı müşterinin hesap bilgileri getiriliyor...");
        // Hesap bilgilerini getirme işlemleri burada yapılır
    }
    
    /**
     * Müşterinin kredi borcu olup olmadığını kontrol eder
     * 
     * @param musteriNo Müşteri numarası
     * @return Kredi borcu varsa true, yoksa false
     */
    public boolean krediBorcuVarMi(String musteriNo) {
        System.out.println("Banka: " + musteriNo + " numaralı müşterinin kredi borcu kontrol ediliyor...");
        // Gerçek uygulamada veritabanı sorgusu yapılır
        return false; // Örnek olarak borç olmadığını varsayalım
    }
} 