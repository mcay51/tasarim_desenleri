package tr.com.mcay.structural.adapter;

/**
 * Fax sınıfını IError arayüzüne uyumlu hale getiren adapter sınıfı
 */
public class FaxAdapter implements IError {
    private Fax fax;
    
    /**
     * FaxAdapter sınıfı için constructor
     * @param fax adapte edilecek Fax nesnesi
     */
    public FaxAdapter(Fax fax) {
        this.fax = fax;
    }
    
    /**
     * Fax nesnesinin getFaxErrorCode metodunu IError arayüzünün getErrorNumber metoduna uyarlar
     * @return faks hata kodu
     */
    @Override
    public int getErrorNumber() {
        return fax.getFaxErrorCode();
    }
    
    /**
     * Fax nesnesinin getErrorDescription metodunu IError arayüzünün getDescription metoduna uyarlar
     * @return faks hata açıklaması
     */
    @Override
    public String getDescription() {
        return fax.getErrorDescription();
    }
} 