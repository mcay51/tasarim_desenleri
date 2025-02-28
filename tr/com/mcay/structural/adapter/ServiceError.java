package tr.com.mcay.structural.adapter;

/**
 * Servis hatalarını temsil eden sınıf
 */
public class ServiceError implements IError {
    private int errorNumber;
    private String description;
    
    /**
     * ServiceError sınıfı için constructor
     * @param errorNumber hata numarası
     * @param description hata açıklaması
     */
    public ServiceError(int errorNumber, String description) {
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