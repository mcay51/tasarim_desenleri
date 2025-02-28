package tr.com.mcay.creational.factory;

public class NotificationClient {
    
    public static void main(String[] args) {
        // E-posta bildirimi gönderme
        INotificationService emailService = NotificationFactory.create(NotificationType.EMAIL);
        emailService.send("Hoşgeldiniz!", "kullanici@example.com");
        
        System.out.println("\n--------------------------\n");
        
        // SMS bildirimi gönderme
        INotificationService smsService = NotificationFactory.create(NotificationType.SMS);
        smsService.send("Siparişiniz onaylandı", "+905551234567");
        
        System.out.println("\n--------------------------\n");
        
        // Push bildirimi gönderme
        INotificationService pushService = NotificationFactory.create(NotificationType.PUSH);
        pushService.send("Yeni mesajınız var", "device_id_123456");
    }
} 