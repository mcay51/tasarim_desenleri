package tr.com.mcay.structural.adapter;

/**
 * Hata işlemleri için standart arayüz
 */
public interface IError {
    /**
     * Hata numarasını döndürür
     * @return hata numarası
     */
    int getErrorNumber();
    
    /**
     * Hata açıklamasını döndürür
     * @return hata açıklaması
     */
    String getDescription();
} 