package tr.com.mcay.creational.factoryabstract;

/**
 * Bildirim istemcisi sınıfı
 */
public class NotificationClient {
    private INotificationFactory factory;

    public NotificationClient(INotificationFactory factory) {
        this.factory = factory;
    }

    public void sendNotifications() {
        IEmailNotification emailNotification = factory.createEmailNotification();
        ISmsNotification smsNotification = factory.createSmsNotification();

        emailNotification.sendEmail();
        smsNotification.sendSms();
    }
} 