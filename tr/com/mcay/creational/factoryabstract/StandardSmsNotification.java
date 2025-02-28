package tr.com.mcay.creational.factoryabstract;

/**
 * Standart SMS bildirimi için somut sınıf
 */
public class StandardSmsNotification implements ISmsNotification {
    @Override
    public void sendSms() {
        System.out.println("STANDART: SMS bildirimi gönderiliyor.");
    }
} 