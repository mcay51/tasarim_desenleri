package tr.com.mcay.behavioral.chainofresponsibility;

/**
 * GrupYoneticisi sınıfı, sorumluluk zincirindeki üçüncü seviye onaylayıcıdır.
 * Yöneticiden daha yüksek, ancak belirli bir limite kadar olan istekleri işleyebilir.
 */
public class GrupYoneticisi extends Calisan {
    
    private static final double APPROVAL_LIMIT = 20000.0;
    
    @Override
    public void handleRequest(double amount) {
        if (amount <= APPROVAL_LIMIT) {
            // Grup Yöneticisi, belirli bir limite kadar olan istekleri onaylayabilir
            System.out.println("Grup Yöneticisi " + amount + " TL tutarındaki harcamayı onayladı.");
        } else if (nextApprover != null) {
            // Limit aşıldığında, istek zincirdeki bir sonraki onaylayıcıya iletilir
            System.out.println("Grup Yöneticisi bu tutarı onaylayamaz. İstek bir üst seviyeye iletiliyor.");
            nextApprover.handleRequest(amount);
        } else {
            // Zincirde başka onaylayıcı yoksa, istek reddedilir
            System.out.println("İstek reddedildi. Onaylayıcı bulunamadı.");
        }
    }
} 