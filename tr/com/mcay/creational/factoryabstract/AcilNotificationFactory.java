package tr.com.mcay.creational.factoryabstract;

/**
 * Acil bildirimler için somut fabrika sınıfı
 */
public class AcilNotificationFactory implements INotificationFactory {
    @Override
    public IEmailNotification createEmailNotification() {
        return new AcilEmailNotification();
    }

    @Override
    public ISmsNotification createSmsNotification() {
        return new AcilSmsNotification();
    }
} 