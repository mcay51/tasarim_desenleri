package tr.com.mcay.structural.adapter;

/**
 * Faks hatalarını temsil eden sınıf
 * Bu sınıf IError arayüzünü doğrudan uygulamaz, farklı metot isimleri kullanır
 */
public class Fax {
    private int faxErrorCode;
    private String errorDescription;
    
    /**
     * Fax sınıfı için constructor
     * @param faxErrorCode faks hata kodu
     * @param errorDescription hata açıklaması
     */
    public Fax(int faxErrorCode, String errorDescription) {
        this.faxErrorCode = faxErrorCode;
        this.errorDescription = errorDescription;
    }
    
    /**
     * Faks hata kodunu döndürür
     * @return faks hata kodu
     */
    public int getFaxErrorCode() {
        return faxErrorCode;
    }
    
    /**
     * Faks hata açıklamasını döndürür
     * @return faks hata açıklaması
     */
    public String getErrorDescription() {
        return errorDescription;
    }
} 