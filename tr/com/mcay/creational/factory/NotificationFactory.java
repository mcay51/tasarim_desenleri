package tr.com.mcay.creational.factory;

public class NotificationFactory {
    
    // Private constructor to prevent instantiation
    private NotificationFactory() {
        // Bu sınıf statik metotlar içerdiği için örneklenmemeli
    }
    
    /**
     * Bildirim tipine göre uygun bildirim servisini oluşturur
     * @param type Bildirim tipi
     * @return INotificationService arayüzünü uygulayan bir servis
     */
    public static INotificationService create(NotificationType type) {
        switch (type) {
            case EMAIL:
                return new EmailNotificationService("smtp.example.com");
            case SMS:
                return new SmsNotificationService("sms.example.com");
            case PUSH:
                return new PushNotificationService("firebase.example.com");
            default:
                throw new IllegalArgumentException("Bilinmeyen bildirim tipi: " + type);
        }
    }
} 