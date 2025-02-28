package tr.com.mcay.behavioral.chainofresponsibilty;

/**
 * Sorumlu sınıfı, sorumluluk zincirindeki ilk seviye onaylayıcıdır.
 * Belirli bir limite kadar olan istekleri işleyebilir.
 */
public class Sorumlu extends Calisan {
    
    private static final double APPROVAL_LIMIT = 1000.0;
    
    @Override
    public void handleRequest(double amount) {
        if (amount <= APPROVAL_LIMIT) {
            // Sorumlu, belirli bir limite kadar olan istekleri onaylayabilir
            System.out.println("Sorumlu " + amount + " TL tutarındaki harcamayı onayladı.");
        } else if (nextApprover != null) {
            // Limit aşıldığında, istek zincirdeki bir sonraki onaylayıcıya iletilir
            System.out.println("Sorumlu bu tutarı onaylayamaz. İstek bir üst seviyeye iletiliyor.");
            nextApprover.handleRequest(amount);
        } else {
            // Zincirde başka onaylayıcı yoksa, istek reddedilir
            System.out.println("İstek reddedildi. Onaylayıcı bulunamadı.");
        }
    }
} 