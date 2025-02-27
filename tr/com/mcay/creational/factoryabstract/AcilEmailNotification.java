package tr.com.mcay.creational.factoryabstract;

/**
 * Acil email bildirimi için somut sınıf
 */
public class AcilEmailNotification implements IEmailNotification {
    @Override
    public void sendEmail() {
        System.out.println("ACİL: Email bildirimi gönderiliyor!");
    }
} 