package tr.com.mcay.creational.factoryabstract;

/**
 * Acil SMS bildirimi için somut sınıf
 */
public class AcilSmsNotification implements ISmsNotification {
    @Override
    public void sendSms() {
        System.out.println("ACİL: SMS bildirimi gönderiliyor!");
    }
} 