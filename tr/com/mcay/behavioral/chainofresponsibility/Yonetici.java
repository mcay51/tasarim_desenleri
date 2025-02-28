package tr.com.mcay.behavioral.chainofresponsibilty;

/**
 * Yonetici sınıfı, sorumluluk zincirindeki ikinci seviye onaylayıcıdır.
 * Sorumludan daha yüksek, ancak belirli bir limite kadar olan istekleri işleyebilir.
 */
public class Yonetici extends Calisan {
    
    private static final double APPROVAL_LIMIT = 5000.0;
    
    @Override
    public void handleRequest(double amount) {
        if (amount <= APPROVAL_LIMIT) {
            // Yönetici, belirli bir limite kadar olan istekleri onaylayabilir
            System.out.println("Yönetici " + amount + " TL tutarındaki harcamayı onayladı.");
        } else if (nextApprover != null) {
            // Limit aşıldığında, istek zincirdeki bir sonraki onaylayıcıya iletilir
            System.out.println("Yönetici bu tutarı onaylayamaz. İstek bir üst seviyeye iletiliyor.");
            nextApprover.handleRequest(amount);
        } else {
            // Zincirde başka onaylayıcı yoksa, istek reddedilir
            System.out.println("İstek reddedildi. Onaylayıcı bulunamadı.");
        }
    }
} 