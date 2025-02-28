package tr.com.mcay.structural.decorator;

/**
 * Maaş hesaplama için temel arayüz
 */
public interface IMaas {
    /**
     * Maaş tutarını hesaplar
     * @return hesaplanan maaş tutarı
     */
    double hesapla();
    
    /**
     * Maaş açıklamasını döndürür
     * @return maaş açıklaması
     */
    String getAciklama();
} 