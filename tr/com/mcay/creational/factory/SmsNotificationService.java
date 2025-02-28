package tr.com.mcay.creational.factory;

public class SmsNotificationService implements INotificationService {
    private String smsGateway;
    
    public SmsNotificationService(String smsGateway) {
        this.smsGateway = smsGateway;
    }
    
    @Override
    public void send(String message, String target) {
        System.out.println("SMS gönderiliyor: " + message);
        System.out.println("Telefon Numarası: " + target);
        System.out.println("SMS Gateway: " + smsGateway);
    }
} 