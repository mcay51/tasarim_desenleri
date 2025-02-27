package tr.com.mcay.creational.factoryabstract;

/**
 * Standart email bildirimi için somut sınıf
 */
public class StandardEmailNotification implements IEmailNotification {
    @Override
    public void sendEmail() {
        System.out.println("STANDART: Email bildirimi gönderiliyor.");
    }
} 