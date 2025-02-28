package tr.com.mcay.behavioral.chainofresponsibilty;

/**
 * Calisan sınıfı, sorumluluk zinciri tasarım deseninin temel sınıfıdır.
 * Bu soyut sınıf, zincirdeki her bir işleyicinin temelini oluşturur.
 */
public abstract class Calisan {
    
    // Zincirdeki bir sonraki onaylayıcı
    protected Calisan nextApprover;
    
    /**
     * Zincirdeki bir sonraki onaylayıcıyı ayarlar
     * 
     * @param next Bir sonraki onaylayıcı
     */
    public void setNextApprover(Calisan next) {
        this.nextApprover = next;
    }
    
    /**
     * İsteği işler ve gerekirse zincirdeki bir sonraki onaylayıcıya iletir
     * 
     * @param amount İşlenecek miktar
     */
    public abstract void handleRequest(double amount);
} 