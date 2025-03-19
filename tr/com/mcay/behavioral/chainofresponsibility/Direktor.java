package tr.com.mcay.behavioral.chainofresponsibility;

/**
 * Direktor sınıfı, sorumluluk zincirindeki en üst seviye onaylayıcıdır.
 * Çok yüksek tutarlı istekleri işleyebilir.
 */
public class Direktor extends Calisan {
    
    private static final double APPROVAL_LIMIT = 100000.0;
    
    @Override
    public void handleRequest(double amount) {
        if (amount <= APPROVAL_LIMIT) {
            // Direktör, belirli bir limite kadar olan istekleri onaylayabilir
            System.out.println("Direktör " + amount + " TL tutarındaki harcamayı onayladı.");
        } else if (nextApprover != null) {
            // Limit aşıldığında, istek zincirdeki bir sonraki onaylayıcıya iletilir
            System.out.println("Direktör bu tutarı onaylayamaz. İstek bir üst seviyeye iletiliyor.");
            nextApprover.handleRequest(amount);
        } else {
            // Zincirde başka onaylayıcı yoksa veya limit çok yüksekse, istek reddedilir
            System.out.println("İstek reddedildi. Tutar çok yüksek veya onaylayıcı bulunamadı.");
        }
    }
} 