package tr.com.mcay.creational.factoryabstract;

/**
 * Standart bildirimler için somut fabrika sınıfı
 */
public class StandardNotificationFactory implements INotificationFactory {
    @Override
    public IEmailNotification createEmailNotification() {
        return new StandardEmailNotification();
    }

    @Override
    public ISmsNotification createSmsNotification() {
        return new StandardSmsNotification();
    }
} 