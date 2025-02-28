package tr.com.mcay.structural.adapter;

/**
 * Veritabanı hatalarını temsil eden sınıf
 */
public class DbError implements IError {
    private int errorNumber;
    private String description;
    
    /**
     * DbError sınıfı için constructor
     * @param errorNumber hata numarası
     * @param description hata açıklaması
     */
    public DbError(int errorNumber, String description) {
        this.errorNumber = errorNumber;
        this.description = description;
    }
    
    @Override
    public int getErrorNumber() {
        return errorNumber;
    }
    
    @Override
    public String getDescription() {
        return description;
    }
} 