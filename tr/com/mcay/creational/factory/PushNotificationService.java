package tr.com.mcay.creational.factory;

public class PushNotificationService implements INotificationService {
    private String pushProvider;
    
    public PushNotificationService(String pushProvider) {
        this.pushProvider = pushProvider;
    }
    
    @Override
    public void send(String message, String target) {
        System.out.println("Push bildirimi gönderiliyor: " + message);
        System.out.println("Cihaz ID: " + target);
        System.out.println("Push Sağlayıcı: " + pushProvider);
    }
} 