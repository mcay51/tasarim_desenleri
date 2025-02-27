package tr.com.mcay.creational.factoryabstract;

/**
 * Bildirim fabrikası için soyut arayüz
 */
public interface INotificationFactory {
    IEmailNotification createEmailNotification();
    ISmsNotification createSmsNotification();
} 